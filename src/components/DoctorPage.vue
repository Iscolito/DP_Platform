<template>
<body>
	<!--banner-->
	<div  id="home" class="banner">
		<div class="banner-info">
			<!--navigation-->
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
                				<li><router-link to="/doctor" class="link-kumya"><span id="name">登录</span></router-link> </li>		
							</ul>	
							<div class="clearfix"> </div>
						</div>
					</div>
				</nav>
			</div>	
			<!--//navigation-->
			<div class="banner-text">
				<!--banner Slider starts Here-->

				<!--//End-slider-script-->
				<div  id="top" class="callbacks_container">
					<ul class="rslides" id="slider3">
						<li>
							<div class="banner-text-info">
								<h2>科普知识</h2>	
								<h3>查看您希望获取的医疗科普知识</h3>	
								<div class="more">
									<router-link to="/knowledge" class="button-pipaluk button--inverted"> 查看更多</router-link>
								</div>	
							</div>	
						</li>
						<li>
							<div class="banner-text-info">
								<h2>医患分享</h2>	
								<h3>做手术前该怎么办？ 治疗药物选择怎么选？ 什么时候做手术？ 住院出院怎么办？ 个人身体情况如何？ 你将在这里了解一切</h3>	
								<div class="more">
									<a href="single.html" class="button-pipaluk button--inverted"> 查看更多</a>
								</div>	
							</div>	
						</li>
						<li>
							<div class="banner-text-info">
								<h2>患者交流</h2>	
								<h3>反复焦虑？希望交流病情？患者专区开放中</h3>	
								<div class="more">
									<a href="single.html" class="button-pipaluk button--inverted"> 查看更多</a>
								</div>	
							</div>	
						</li>
					</ul>
				</div>
			</div>	
		</div>
	</div>
	<!--//banner-->
	<!--welcome-->
	<div class="welcome">
		<div class="container">
			<div class="col-md-6 welcome-left ">
				<img src="../assets/css/images/img1.jpg" alt=""/>
			</div>
			<div class="col-md-6 welcome-right">
				<h3 class="title">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp欢迎!</h3>
				<p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp本平台将提供三方面服务:科普知识，医患分享，患者交流。希望您能在平台获取自己需要的信息，祝您身体健康，平安顺遂！ </p>
				<div class="welcome-info">
					<div class="col-md-2 welcome-text wtext-left">
						<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
					</div>
					<div class="col-md-10 welcome-text wtext-right">
						<h4>科普知识</h4>
						<p>任何人可免费浏览科普专区，查询了解各种疾病及药物 </p>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="welcome-info">
					<div class="col-md-2 welcome-text wtext-left">
						<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
					</div>
					<div class="col-md-10 welcome-text wtext-right">
						<h4>医患分享</h4>
						<p>需通过医生授权的特定范围内服务，医生诊断后对患者授权相应疾病治疗的“临床路径”，患者可查看相应疾病的术前术后注意、选择用药、出院标准等 </p>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="welcome-info">
					<div class="col-md-2 welcome-text wtext-left">
						<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
					</div>
					<div class="col-md-10 welcome-text wtext-right">
						<h4>患者交流</h4>
						<p>提供给患者之间交流的平台，可在医生授权的患者所发帖子底下评论交流。本平台旨在为患者提供更专业、更系统化的医疗信息，尽力消除医患信息差，助力和谐医患关系的创建。 </p>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
	<!--//welcome-->

	<!--slid-->
	<div class="slid">
		<h3 class="title">模块选择</h3>
		<div class="container">	
			<div class="slid-row">
				<div class="col-md-4 slid-grids">
					<h4>科普知识</h4>
					<h5>Medical Knowledge</h5>
					<div class="more">
						<router-link to="/knowledge" class="button-pipaluk button--inverted"> Read More</router-link>
					</div>	
				</div>
				<div class="col-md-4 slid-grids">
					<h4>医患分享</h4>
					<h5>Sharing</h5>
					<div class="more">
						<a href="single.html" class="button-pipaluk button--inverted"> Read More</a>
					</div>	
				</div>
				<div class="col-md-4 slid-grids">
					<h4>患者交流</h4>
					<h5>Board</h5>
					<div class="more">
						<a href="single.html" class="button-pipaluk button--inverted"> Read More</a>
					</div>	
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!--//slid-->
	<!-- services -->
	<div class="services" id="services">
		<div class="container">
			<h3 class="title">服务一览</h3>
			<div class="servc-grids">
				<div class="col-md-6 servc-grid">
					<div class="col-xs-3 servc-grid-left">
						<span class="glyphicon glyphicon-th-large effect-1" aria-hidden="true"></span>
					</div>
					<div class="col-xs-9 servc-grid-right">
						<h4>疾病查询</h4>
						<p>支持直接搜索和科室查找</p>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="col-md-6 servc-grid">
					<div class="col-xs-3 servc-grid-left">
						<span class="glyphicon glyphicon-tree-deciduous effect-1" aria-hidden="true"></span>
					</div>
					<div class="col-xs-9 servc-grid-right">
						<h4>药品查询</h4>
						<p>支持直接搜索和科室查找</p>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="servc-grids">
				<div class="col-md-6 servc-grid">
					<div class="col-xs-3 servc-grid-left">
						<span class="glyphicon glyphicon-tasks effect-1" aria-hidden="true"></span>
					</div>
					<div class="col-xs-9 servc-grid-right">
						<h4>科普专区</h4>
						<p>获得专业的医疗科普信息</p>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="col-md-6 servc-grid">
					<div class="col-xs-3 servc-grid-left">
						<span class="glyphicon glyphicon-globe effect-1" aria-hidden="true"></span>
					</div>
					<div class="col-xs-9 servc-grid-right">
						<h4>术前分析</h4>
						<p>根据就诊情况开放患者的查看权限，进行各项项目检查</p>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="servc-grids">
				<div class="col-md-6 servc-grid">
					<div class="col-xs-3 servc-grid-left">
						<span class="glyphicon glyphicon-cog effect-1" aria-hidden="true"></span>
					</div>
					<div class="col-xs-9 servc-grid-right">
						<h4>治疗过程</h4>
						<p>跟踪患者的全部治疗过程</p>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="col-md-6 servc-grid">
					<div class="col-xs-3 servc-grid-left">
						<span class="glyphicon glyphicon-link effect-1" aria-hidden="true"></span>
					</div>
					<div class="col-xs-9 servc-grid-right">
						<h4>发帖专区</h4>
						<p>治疗结束的患者之间进行讨论交流</p>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!-- //services -->

	<div></div>
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
@import '../assets/css/homepage/bootstrap.css';
@import '../assets/css/homepage/flexslider.css';
@import '../assets/css/homepage/lightbox.css';
@import '../assets/css/homepage/prettySticky.css';
@import '../assets/css/homepage/style.css';
</style>
