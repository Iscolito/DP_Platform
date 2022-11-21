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
                				<li><router-link to="/login" class="link-kumya"><span id="name">登录</span></router-link> </li>		
							</ul>	
						</div>
					</div>
				</nav>
			</div>
		</div>
	</div>	
	<!--//banner-->
	<div class="pageset">
		<div class="grid_3 grid_5">
			<h3 class="title">患者交流</h3>
				<div class="well" v-for="v in chats">
					<button @click="saveRoute(v.num)" class="btn_nocolor">{{v.text}}</button>
					<br></br>
					<span>发帖日期：{{v.time}}</span>
					<span>发帖人：{{v.username}}</span>
				</div>
		</div>
	</div>
	<div class="contact-grid">
		<h3 class="title">发帖</h3>
		<p>分享您的就医经历/当前遇到的问题 </p>
		<form>
			<textarea type="text" v-model="submission.text" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Message...';}" required="">Message...</textarea>
			<input type="submit" v-on:click="submit" value="Send Message" >
		</form>
	</div>

	<!--//blog-->
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
function unlogin(){
	var r=confirm("未登录，请登录后再试"); 
if (r==true) 
  {
   } 
 else 
   { 
   }
}

function fail(){
	var r=confirm("连接失败"); 
if (r==true) 
  {
   } 
 else 
   { 
   }
}

function success(){
	var r=confirm("发帖成功"); 
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
  name: 'chat',
  data () {
    return {
		submission:{
			username:'',
			time:'',
			text:''
		},
		chats:[]
    }
  },
  mounted(){
	if (location.href.indexOf("#reloaded") == -1) {
                location.href = location.href + "#reloaded";
                location.reload();
            }
	if(sessionStorage.getItem("name")!=null){
		welcome_name();
	}
	this.showchat();
  },
  methods:{
	submit () {
		var temptime=new Date();
		this.submission.time=temptime.getFullYear()+"."+temptime.getMonth()+"."+temptime.getDate();
		this.submission.username=sessionStorage.getItem("username");
		console.log(this.submission.username);
		console.log(this.submission.time);
		console.log(this.submission.text);
		if(this.submission.username==null){
			unlogin();
		}
		else{
			this.$axios
				.post('/chatsubmit', {
					username: this.submission.username,
					time: this.submission.time,
					text:this.submission.text,
			})
				.then(successResponse =>{
					location.reload();
					success();
				})
				.catch(failResponse =>{
					fail();
				})
			}
 	},
	showchat(){
		this.$axios
		.post('/chatget', {
			Infocode:110
	})
		.then(successResponse =>{
			var res=successResponse.data
			console.log(res);
			for(var i=0;i<res.username.length; i++){
				this.chats.push({
					username:res.username[i],
					time:res.time[i],
					text:res.text[i],
					num:res.num[i]
				});
			}
			console.log(this.chats);
		})
		.catch(failResponse =>{
			fail();
		})
	},
	saveRoute(chatid){
	this.$router.push('/chat');
	sessionStorage.setItem('chatid', chatid);
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
	margin-top:-70px;
}
.btn_nocolor{
            background-color:transparent;
            border-style:none;
			color:rgb(79, 79, 245);
        }
</style>
