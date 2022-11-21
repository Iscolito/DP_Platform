<template>
<body class="pageset">
	<h2 class="typoh2">用户名单</h2>
			<div class="bs-docs-example">
				<table class="table">
					<thead>
						<tr>
							<th>id</th>
							<th>姓名</th>
							<th>性别</th>
							<th>年龄</th>
							<th>邮箱</th>
							<th>联系方式</th>
							<th>症状简介</th>
						</tr>
					</thead>
					<tbody>
						<tr v-for="v in list">
                			<td>{{v.username}}</td>
                			<td>{{v.name}}</td>
                			<td>{{v.sex}}</td>
							<td>{{v.age}}</td>
							<td>{{v.mail}}</td>
							<td>{{v.tel}}</td>
							<td>{{v.info}}</td>
            			</tr>
					</tbody>
				</table>
			</div>
		</div>
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

function fail(){
	var r=confirm("数据库连接断开"); 
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
		Infocode:100,
		list:[],
		responseResult: []
    }
  },
  mounted(){
	if (location.href.indexOf("#reloaded") == -1) {
                location.href = location.href + "#reloaded";
                location.reload();
            }
	this.getdata();
  },

  methods:{

	getdata () {
		this.$axios
			.post('/user', {
				Infocode:this.code
          })
		    .then(successResponse =>{
				var res=successResponse.data
				console.log(res);
				console.log(this.list);
				for(var i = 0; i<res.username.length; i++){
					console.log(this.list);
					this.list.push({
						username:res.username[i],
						password:res.password[i],
						name: res.name[i],
						sex: res.sex[i],
						age: res.age[i],
						mail: res.mail[i],
						tel: res.tel[i],
						info: res.info[i]
					});
				}
	
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
	margin-top:-55px;
}
</style>
