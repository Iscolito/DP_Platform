<template>
<body>
	<!--banner-->
	<!--navigation-->
	<div  id="home" class="banner">
		<div class="banner-info">
			<div class="top-nav">
				<nav>
					<div class="container">
						<div class="navbar-header logo">
							<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
							<h1><router-link to="/" class="link-kumya"><span data-letters="医患信息共享平台">医患信息共享平台</span></router-link></h1>
						</div>
						<!-- Collect the nav links, forms, and other content for toggling -->
						<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-right">
								<li><router-link to="/" class="link-kumya"><span data-letters="主页">主页</span></router-link> </li>	
								<li><a href="about.html" class="link-kumya"><span data-letters="关于">关于</span></a></li>	
								<li><a href="portfolio.html" class="link-kumya"><span data-letters="个人中心">个人中心</span></a></li>
								<li><a target="_blank" href="http://mail.qq.com/cgi-bin/qm_share?t=qm_mailme&email=osvRwc3Oy9bN4tPTjMHNzw" class="link-kumya"><span data-letters="联系我们">联系我们</span></a></li>
                				<li><router-link to="/login" class="link-kumya"><span data-letters="登录">登录</span></router-link> </li>		
							</ul>	
						</div>
					</div>
				</nav>
			</div>
		</div>
	</div>	
	<!--Shortcodes-page -->
	<div class="container">
			<h3 class="hdg">注册</h3>
			<div class="input-group">
				<span class="input-group-addon" id="basic-addon1">姓名</span>
				<input type="text" v-model="registForm.name" class="form-control" placeholder="Username" aria-describedby="basic-addon1">
			</div>
			<div class="input-group">
				<span class="input-group-addon" id="basic-addon1">密码</span>
				<input type="text" v-model="registForm.password" class="form-control" placeholder="" aria-describedby="basic-addon1">
			</div>
			<div class="input-group">
				<span class="input-group-addon" id="basic-addon1">性别</span>
				<input type="text" v-model="registForm.sex" class="form-control" placeholder="男/女" aria-describedby="basic-addon1">
			</div>
			<div class="input-group">
				<span class="input-group-addon" id="basic-addon1">年龄</span>
				<input type="text" v-model="registForm.age" class="form-control" placeholder="" aria-describedby="basic-addon1">
			</div>
			<div class="input-group">
				<input type="text" v-model="registForm.mail" class="form-control" placeholder="邮箱" aria-describedby="basic-addon2">
				<span class="input-group-addon" id="basic-addon2">@example.com</span>
			</div>
			<div class="input-group">
				<span class="input-group-addon"  id="basic-addon2">+86</span>
				<input type="text" v-model="registForm.tel" class="form-control" placeholder="电话" aria-describedby="basic-addon2">
			</div>
			<div class="input-group input-group-lg">
				<span class="input-group-addon" id="sizing-addon1">情况描述</span>
				<input type="text" v-model="registForm.info" class="form-control" placeholder="不超过100字" aria-describedby="sizing-addon1">
			</div>
			<h2>
				<button v-on:click="regist">提交</button>
			</h2>
		</div>
		</br>
	<!--footer-->
	<div class="footer">
		<div class="container">
			<div class="col-md-4 footer-grids">
				<h3>关于平台</h3>
				<p>本平台旨在为患者提供更专业、更系统化的医疗信息，尽力消除医患信息差，助力和谐医患关系的创建。所有权和最终解释权归项目负责人所有。</p>
			</div>
			<div class="col-md-3 footer-grids">
				<h3>联系平台技术</h3>
				<p>IST工作室 Iscolito<br>
					<span>iscolito@qq.com</span>
				</p>
				<div class="footer-bottom">
					<a href="#"><span>Facebook</span></a>
					<a href="#"><span>Pinterest</span></a>
					<a href="#"><span>LinkedIn </span></a>
					<a href="#"><span>Behance</span></a>
				</div>
			</div>
			<div class="col-md-5 footer-grids">
				<h3>平台支持</h3>
				<p>本平台基于Springboot、Vue、MySQL建立，部署在netlify服务器上</p>
			</div>
			<div class="clearfix"> </div>
			<div class="footer-copy">
				<p>Copyright &copy; 2022.Company name All rights reserved.</p>
			</div>
		</div>
	</div>
</body>
</template>

<script>
import  { jQuery } from "../assets/js/jquery-1.11.1.min.js"
import  { flexslider } from "../assets/js/jquery.flexslider.js"
import  { responsiveslides } from "../assets/js/responsiveslides.min.js"
import  { prettySticky } from "../assets/js/prettySticky.js"

function success() 
{ 
  var r=confirm("注册成功，您的账号为"+sessionStorage.getItem("id")+"请牢记本账号以用于登录操作"); 
if (r==true) 
  {
   } 
 else 
   { 
   }
} 
function fail() 
{ 
  var r=confirm("注册失败"); 
if (r==true) 
  {
   } 
 else 
   { 
   }
} 

export default {
  inject: ['reload'],
  name: 'Regist',
  data () {
    return {
		registForm: {
			name: '',
			password: '',
			sex: '',
			age: '',
			mail: '',
			tel: '',
			info: '',
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
  methods:{
	regist () {
		this.$axios
			.post('/regist', {
				name: this.registForm.name,
				password: this.registForm.password,
				sex:this.registForm.sex,
				age:this.registForm.age,
				mail:this.registForm.mail,
				tel:this.registForm.tel,
				info:this.registForm.info
          })
		    .then(successResponse =>{
				sessionStorage.setItem('id', successResponse.data.code);
				success();
			})
			.catch(failResponse =>{
				fail();
			})
 	}
  }
}

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
@import '../assets/css/homepage/bootstrap.css';
@import '../assets/css/homepage/flexslider.css';
@import '../assets/css/homepage/lightbox.css';
@import '../assets/css/homepage/prettySticky.css';
@import '../assets/css/homepage/styleside.css';
</style>
