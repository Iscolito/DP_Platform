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
	<!--//banner-->
	<div class="main">
			<div class="main-left">
				<div class="center-left">
					<span id="name">外科</span>
				</div>
			</div>
				<div class="span">
						<ul>
							<li class="pane"><a href="/#/knowledge/info1/p1" target="frame">普通外科</a></li>
							<li class="pane"><a href="https://iscolitoblog-note.netlify.app/" target="frame">外科综合</a></li>
							<li class="pane"><a href="https://github.com/Iscolito" target="frame">骨科</a></li>
							<li class="pane"><a href="https://github.com/Iscolito" target="frame">心血管外科</a></li>
							<li class="pane"><a href="https://github.com/Iscolito" target="frame">心胸外科</a></li>
							<li class="pane"><a href="https://github.com/Iscolito" target="frame">乳腺外科</a></li>
							<li class="pane"><a href="https://github.com/Iscolito" target="frame">烧伤科</a></li>
							<li class="pane"><a href="https://github.com/Iscolito" target="frame">整形外科</a></li>
							<li class="pane"><a href="https://github.com/Iscolito" target="frame">肝胆外科</a></li>
						</ul>
				</div>
				<div class="center">
					<iframe src="/#/knowledge/info1/p1" width="850px" height="850px" frameborder="0" scrolling="yes" name="frame"></iframe>
				</div>
	</div>
	<div><br></br></div>
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
</body>
</template>

<script>
addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); }
jQuery(document).ready(function($) {
			$(".scroll").click(function(event){		
				event.preventDefault();
		
		$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
			});
		});
import  { jQuery } from "../assets/js/jquery-1.11.1.min.js"
import  { flexslider } from "../assets/js/jquery.flexslider.js"
import  { responsiveslides } from "../assets/js/responsiveslides.min.js"
$(function () {
    // Slideshow 3
    $("#slider3").responsiveSlides({
    auto: true,
    pager: false,
    nav: false,
    speed: 500,
    namespace: "callbacks",
    before: function () {
      $('.events').append("<li>before event fired.</li>");
    },
    after: function () {
      $('.events').append("<li>after event fired.</li>");
    }
    });

  });


import  { prettySticky } from "../assets/js/prettySticky.js"

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
  },
  methods:{}
}



</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
@import '../assets/css/infopage/info1/p1.css';
@import '../assets/css/homepage/bootstrap.css';
@import '../assets/css/homepage/flexslider.css';
@import '../assets/css/homepage/lightbox.css';
@import '../assets/css/homepage/prettySticky.css';
@import '../assets/css/homepage/styleside.css';
</style>
