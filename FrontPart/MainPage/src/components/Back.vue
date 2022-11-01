<template>
<body>
<!--顶部信息区-->
<br></br>
<header role="header">
    <div>
        <h1>医生平台</h1>
        <nav role="user">
            <ul>
                <li>欢迎管理员:<strong id="name">admin</strong></li>
                <li><a href="modify_pass.html" target="main">修改密码</a></li>
                <li><router-link to="/">退出登录</router-link></li>
            </ul>
        </nav>
    </div>
</header>
<!--圣杯二列布局-->
<main role="main">
    <!--主体内联框架区-->
    <article role="content">
        <iframe src="/#/doctor"  name="main"></iframe>
        <footer role="copyright">
			<br></br>
            <p>mod by IST工作室</p>
        </footer>
    </article>
    <!--左侧导航区-->
    <aside>
        <nav role="option">
            <ul>
				<br></br>
				<br></br>
                <li>导航列表</li>
                <li><a href="setting.html" target="main"  class="active" >主页</a></li>
                <li><a href="user.html" target="main">用户管理</a></li>
                <li><a href="article.html" target="main">文档管理</a></li>
                <li><a href="category.html" target="main">留言管理</a></li>
                <li><a href="product.html" target="main">产品管理</a></li>
            </ul>
        </nav>
    </aside>
</main>
</body>
</template>

<script>
    function logout() {
        if (window.confirm('是否退出?')) {
            window.location.href = 'login.html';
        } else {
            return false;
        }
    }
	function welcome_name(){
		var x=document.getElementById("name");
		x.innerHTML=sessionStorage.getItem("username")+"(医生)";
	}


export default {
  inject: ['reload'],
  name: 'HelloWorld',
  data () {
    return {
    }
  },
  mounted(){
	if (location.href.indexOf("#reloaded") == -1) {
                location.href = location.href + "#reloaded";
                location.reload();
            }
	welcome_name();
  },
  methods:{}
}

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
@import '../assets/css/backend/back.css';
</style>
