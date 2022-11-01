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
	<!--blog-->
		<div class="container">
			<h3 class="title">医疗科普</h3>
			<div class="blog-info">
				<div class="col-md-6 blog-grids">
					<div class="blog-img">
						<router-link to="knowledge/info1"> <img src="../assets/css/images/g1.jpg" class="img-responsive zoom-img" alt=""/></router-link>
					</div>
					<br></br>
					<h2><router-link to="knowledge/info1">外科</router-link></h2>
					<p>包含科室： </p>
					<p>普通外科 外科综合 骨科 心血管外科 胸部外科 心胸外科 乳腺外科 烧伤科 整形外科 肝胆外科 肛肠外科 神经外科 泌尿外科 腹腔镜科</p>
				</div>
				<div class="col-md-6 blog-grids">
					<div class="blog-img">
						<router-link to="knowledge/info1"> <img src="../assets/css/images/g2.jpg" class="img-responsive zoom-img" alt=""/></router-link>
					</div>
					<br></br>
					<h2><a href="single.html">内科 </a></h2>
					<p>包含科室： </p>
					<p>内科综合 呼吸内科 消化内科 心血管内科 血液内科 肾脏内科 内分泌科 风湿免疫科 神经内科 老年病科</p>
				</div>
				<div class="col-md-6 blog-grids">
					<div class="blog-img">
						<a href="single.html"> <img src="../assets/css/images/g3.jpg" class="img-responsive zoom-img" alt=""/></a>
					</div>
					<br></br>
					<h2><a href="single.html">儿科 </a></h2>
					<p>包含科室： </p>
					<p>小儿外科 小儿内科 儿童保健科 新生儿专科</p>
				</div>
				<div class="col-md-6 blog-grids">
					<div class="blog-img">
						<a href="single.html"> <img src="../assets/css/images/g4.jpg" class="img-responsive zoom-img" alt=""/></a>
					</div>
					<br></br>
					<h2><a href="single.html">五官科 </a></h2>
					<p>包含科室： </p>
					<p>眼科 耳鼻喉科 口腔科</p>
				</div>
				<div class="col-md-6 blog-grids">
					<div class="blog-img">
						<a href="single.html"> <img src="../assets/css/images/g5.jpg" class="img-responsive zoom-img" alt=""/></a>
					</div>
					<br></br>
					<h2><a href="single.html">皮肤性病科 </a></h2>
					<p>包含科室： </p>
					<p>皮肤科 性病科 皮肤性病科综合</p>
				</div>
				<div class="col-md-6 blog-grids">
					<div class="blog-img">
						<a href="single.html"> <img src="../assets/css/images/g6.jpg" class="img-responsive zoom-img" alt=""/></a>
					</div>
					<br></br>
					<h2><a href="single.html">中医科 </a></h2>
					<p>包含科室： </p>
					<p>中医外科 中医内科 中医儿科 中医科综合 中医皮肤科 中医五官科 中医妇产科 中医男科 针灸科 推拿科 中医肿瘤科 中医骨伤科 中医康复科 中医肛肠科</p>
				</div>
				<div class="col-md-6 blog-grids">
					<div class="blog-img">
						<a href="single.html"> <img src="../assets/css/images/g7.jpg" class="img-responsive zoom-img" alt=""/></a>
					</div>
					<br></br>
					<h2><a href="single.html">肿瘤科 </a></h2>
					<p>包含科室： </p>
					<p>肿瘤内科 肿瘤外科 放疗科 肿瘤康复科 肿瘤综合科</p>
				</div>
				<div class="col-md-6 blog-grids">
					<div class="blog-img">
						<a href="single.html"> <img src="../assets/css/images/g8.jpg" class="img-responsive zoom-img" alt=""/></a>
					</div>
					<br></br>
					<h2><a href="single.html">传染科 </a></h2>
					<p>包含科室： </p>
					<p>肝病科 艾滋病科 结核病 寄生虫</p>
				</div>
				<div class="col-md-6 blog-grids">
					<div class="blog-img">
						<a href="single.html"> <img src="../assets/css/images/g9.jpg" class="img-responsive zoom-img" alt=""/></a>
					</div>
					<br></br>
					<h2><a href="single.html">妇产科 </a></h2>
					<p>包含科室： </p>
					<p>妇科 产科 妇产科综合</p>
				</div>
				<div class="col-md-6 blog-grids">
					<div class="blog-img">
						<a href="single.html"> <img src="../assets/css/images/g10.jpg" class="img-responsive zoom-img" alt=""/></a>
					</div>
					<br></br>
					<h2><a href="single.html">康复科 </a></h2>
					<p>包含科室： </p>
					<p>康复科</p>
				</div>
				<div class="col-md-6 blog-grids">
					<div class="blog-img">
						<a href="single.html"> <img src="../assets/css/images/g11.jpg" class="img-responsive zoom-img" alt=""/></a>
					</div>
					<br></br>
					<h2><a href="single.html">医学影像科 </a></h2>
					<p>包含科室： </p>
					<p>核医学科 放射科 超声科</p>
				</div>
				<div class="col-md-6 blog-grids">
					<div class="blog-img">
						<a href="single.html"> <img src="../assets/css/images/g12.jpg" class="img-responsive zoom-img" alt=""/></a>
					</div>
					<br></br>
					<h2><a href="single.html">心理健康科 </a></h2>
					<p>包含科室： </p>
					<p>心理健康科</p>
				</div>
				<div class="col-md-6 blog-grids">
					<div class="blog-img">
						<a href="single.html"> <img src="../assets/css/images/g13.jpg" class="img-responsive zoom-img" alt=""/></a>
					</div>
					<br></br>
					<h2><a href="single.html">精神科 </a></h2>
					<p>包含科室： </p>
					<p>精神科综合</p>
				</div>
				<div class="col-md-6 blog-grids">
					<div class="blog-img">
						<a href="single.html"> <img src="../assets/css/images/g14.jpg" class="img-responsive zoom-img" alt=""/></a>
					</div>
					<br></br>
					<h2><a href="single.html">中西医结合 </a></h2>
					<p>包含科室： </p>
					<p>中西医结合</p>
				</div>
				<div class="col-md-6 blog-grids">
					<div class="blog-img">
						<a href="single.html"> <img src="../assets/css/images/g15.jpg" class="img-responsive zoom-img" alt=""/></a>
					</div>
					<br></br>
					<h2><a href="single.html">医学美容科 </a></h2>
					<p>包含科室： </p>
					<p>医学美容科</p>
				</div>
				<div class="col-md-6 blog-grids">
					<div class="blog-img">
						<a href="single.html"> <img src="../assets/css/images/g16.jpg" class="img-responsive zoom-img" alt=""/></a>
					</div>
					<br></br>
					<h2><a href="single.html">其他 </a></h2>
					<p>包含科室： </p>
					<p>急诊科 疼痛科 预防保健科 麻醉科 特需门诊 其他</p>
				</div>
				<div class="clearfix"> </div>
			</div>	
		</div>
		<div><br></br></div>	
	<!--//blog-->
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
@import '../assets/css/homepage/bootstrap.css';
@import '../assets/css/homepage/flexslider.css';
@import '../assets/css/homepage/lightbox.css';
@import '../assets/css/homepage/prettySticky.css';
@import '../assets/css/homepage/styleside.css';
</style>
