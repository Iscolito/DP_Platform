<template>
<body class="pageset">
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
                				<li><router-link to="/login" class="link-kumya"><span id="name">登录</span></router-link> </li>		
							</ul>	
						</div>
					</div>
				</nav>
			</div>
		</div>
	</div>	
	<!--//banner-->
	<div >
	<div class="single-page blog">

	<div class="admin-text" v-for="v in chats">
				<h5>发帖日期：{{v.time}}  发帖人：{{v.username}}</h5>
					<div class="admin-text-left">
						<a href="#"><img src="images/icon2.png" alt=""/></a>
					</div>
					<div class="admin-text-center">
					<span>{{v.text}}</span>
					<br></br>
					</div>
					<div class="clearfix"> </div>
				</div>	
			</div>
			<div class="media response-info" v-for="r in reply">
						<div class="media-left response-text-left">
							<h5><a href="#">发帖人：{{r.username}}</a></h5>
						</div>
						<div class="media-body response-text-right">
							<p>{{r.text}}</p>
							<ul>
								<li>发帖日期：{{r.time}}</li>
								<li>回复</li>
							</ul>
						</div>
						<button @click="chatdelete(r.num)" class="btn_nocolor">删除</button>
			</div>
		
	</div>
</div>




	<!--//blog-->
	<br></br>
	<br></br>
	<h4>
	<router-link to="/dchatlist">返回</router-link>
	</h4>
	<br></br>
	<br></br>
	<br></br>
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

function fail(){
	var r=confirm("连接失败"); 
if (r==true) 
  {
   } 
 else 
   { 
   }
}
function unlogin(){
	var r=confirm("未登录，请登录后再试"); 
if (r==true) 
  {
   } 
 else 
   { 
   }
}

function success(){
	var r=confirm("删除成功"); 
if (r==true) 
  {
   } 
 else 
   { 
   }
}

import  { jQuery } from "../assets/js/jquery-1.11.1.min.js"
import  { flexslider } from "../assets/js/jquery.flexslider.js"
import  { responsiveslides } from "../assets/js/responsiveslides.min.js"
import  { prettySticky } from "../assets/js/prettySticky.js"

function welcome_name(){
		var x=document.getElementById("name");
		x.innerHTML=sessionStorage.getItem("username")+"(已登录)";
	}

export default {
  inject: ['reload'],
  name: 'HelloWorld',
  data () {
    return {
		chats:[],
		submission:{
			username:'',
			time:'',
			text:'',
			num:sessionStorage.getItem('chatid')
		},
		reply:[]
    }
  },
  mounted(){
	if (location.href.indexOf("#reloaded") == -1) {
                location.href = location.href + "#reloaded";
                location.reload();
            }
	console.log(sessionStorage.getItem('chatid'));
	if(sessionStorage.getItem("name")!=null){
		welcome_name();
	}
	this.showchat();
	this.showreply()
  },
  methods:{
	showchat(){
		console.log(sessionStorage.getItem('chatid'));
		this.$axios
		.post('/singleget', {
			Infocode:sessionStorage.getItem('chatid')
	})
		.then(successResponse =>{
			var res=successResponse.data
			console.log(res);
				this.chats.push({
					username:res.username[0],
					time:res.time[0],
					text:res.text[0],
					num:res.num[0]
				})
			console.log(this.chats);
		})
		.catch(failResponse =>{
			fail();
		})
	},
	showreply(){
		this.$axios
		.post('/replyget', {
			Infocode:sessionStorage.getItem('chatid')
	})
		.then(successResponse =>{
			var res=successResponse.data
			console.log(res);
			for(var i=0;i<res.username.length;i++)
			{
				this.reply.push({
					num:res.num[i],
					username:res.username[i],
					time:res.time[i],
					text:res.text[i],
				})
			}
			console.log(this.reply);
		})
		.catch(failResponse =>{
			fail();
		})
	},
	 chatdelete(chatid){
		this.$axios
		.post('/replydel', {
			Infocode:chatid,
			Gcode:sessionStorage.getItem('chatid')
	})
		.then(successResponse =>{
			location.reload();
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
.pageset{
	margin-top:-700px;
}
.btn_nocolor{
            background-color:transparent;
            border-style:none;
			color:rgb(79, 79, 245);
        }
</style>
