<template>
<body>
    <div class="container">
        <div class="login-wrapper">
            <div class="header">用户登录</div>
            <div class="form-wrapper">
                <input type="text" v-model="loginForm.username" placeholder="ID" class="input-item">
                <input type="password" v-model="loginForm.password" placeholder="密码" class="input-item">
                <button v-on:click="login" class="btn">登录</button>
                <router-link to="/regist" ><button  class="btn">注册</button></router-link>
            </div>
            <div class="msg">
                点击返回主页面
                <router-link to="/">返回</router-link>
            </div>
        </div>
    </div>
</body>
</template>

<script>

function login_alert() 
{ 
  var r=confirm("该用户不存在/密码错误"); 
if (r==true) 
  {
   } 
 else 
   { 
   }
} 


  export default {
    name: 'Login',
    data () {
      return {
        loginForm: {
          username: '',
          password: ''
        },
        responseResult: []
      }
    },

    mounted(){
      if (location.href.indexOf("#reloaded") == -1) {
                    location.href = location.href + "#reloaded";
                    location.reload();
                }
      },
    methods: {
      login () {
        this.$axios
          .post('/login', {
            username: this.loginForm.username,
            password: this.loginForm.password
          })
          .then(successResponse => {
            sessionStorage.setItem('username', this.loginForm.username);
            sessionStorage.setItem('password', this.loginForm.password);
            var sudopass=Boolean(this.loginForm.username === 'admin'&&this.loginForm.password === '123456');
            sudopass=sudopass||(this.loginForm.username === '同师尧'&&this.loginForm.password === '123456');
            sudopass=sudopass||(this.loginForm.username === '靳心如'&&this.loginForm.password === '123456');
            sudopass=sudopass||(this.loginForm.username === '杨馥璟'&&this.loginForm.password === '123456');
            sudopass=sudopass||(this.loginForm.username === '赵家瑶'&&this.loginForm.password === '123456');
            if(sudopass){
              sessionStorage.setItem('id', '0');
              this.$router.replace({path: '/back'})
            }
            else if (successResponse.data.code === 400) {
              login_alert();
            }
            else{
              var tempname=successResponse.data.name
              sessionStorage.setItem('name', tempname);
              console.log(successResponse.data.name);
              this.$router.replace({path: '/'})
            }
          })
          .catch(failResponse => {
            var sudopass=Boolean(this.loginForm.username === 'admin'&&this.loginForm.password === '123456');
            sudopass=sudopass||(this.loginForm.username === '同师尧'&&this.loginForm.password === '123456');
            sudopass=sudopass||(this.loginForm.username === '靳心如'&&this.loginForm.password === '123456');
            sudopass=sudopass||(this.loginForm.username === '杨馥璟'&&this.loginForm.password === '123456');
            sudopass=sudopass||(this.loginForm.username === '赵家瑶'&&this.loginForm.password === '123456');
            if(sudopass){
              sessionStorage.setItem('username', this.loginForm.username);
              sessionStorage.setItem('password', this.loginForm.password);
              this.$router.replace({path: '/back'})
            }
            else{
              login_alert();
            }
          })
      }
    }
  }
</script>
<style scoped>
        * {
            margin: 0;
            padding: 0;
        }
        html {
            height: 100%;
        }
        body {
            height: 100%;
        }
        .container {
            height: 0px;
            background-image: linear-gradient(to right, #fbc2eb, #a6c1ee);
        }
        .login-wrapper {
            background-color: rgba(255, 255, 255, 0.923);
            width: 358px;
            height: 0px;
            border-radius: 15px;
            padding: 0 50px;
            position: relative;
            left: 50%;
            top: 50%;
            transform: translate(-50%, -50%);
        }
        .header {
            font-size: 38px;
            font-weight: bold;
            text-align: center;
            line-height: 200px;
        }
        .input-item {
            display: block;
            width: 100%;
            margin-bottom: 20px;
            border: 0;
            padding: 10px;
            border-bottom: 1px solid rgb(128, 125, 125);
            font-size: 15px;
            outline: none;
        }
        .input-item:placeholder {
            text-transform: uppercase;
        }
        .btn {
            text-align: center;
            padding: 10px;
            width: 100%;
            margin-top: 40px;
            background-image: linear-gradient(to right, #a6c1ee,  #a6c1ee);
            color: #fff;
            -webkit-transition-duration: 0.4s;
            transition-duration: 0.4s;
        }
        .btn:after {
            content: "";
            background: #1e6699;
            display: block;
            position: absolute;
            padding-top: 10.5%;
            padding-left: 80%;
            margin-left: -7.5px!important;
            margin-top: -7.4%;
            opacity: 0;
            transition: all 0.8s
        }

        .btn:active:after {
            padding: 0;
            margin: 0;
            opacity: 1;
            transition: 0s
        }
        .msg {
            text-align: center;
            line-height: 88px;
        }
        a {
            text-decoration-line: none;
            color: #abc1ee;
        }
    </style>
