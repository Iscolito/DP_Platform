<template>
<div class="blog-tags">
	<h3>普通外科</h3>
	<br></br>
	<ul>
		<li><a href="#">急性阑尾炎</a></li>
		<br></br>
		<li><a href="#">念珠病菌</a></li>
		<br></br>
		<li><a href="#">Office</a></li>
	</ul>
	<br></br>
	<ul>
		<li><a href="#">Company</a></li>
		<br></br>
		<li><a href="#">Costly House</a></li>
	</ul>
	<br></br>
	<ul>
		<li><a href="#">House</a></li>
		<br></br>
		<li><a href="#">Apartments</a></li>
		<br></br>
		<li><a href="#">Duplex</a></li>
	</ul>
	<br></br>
	<ul>
		<li><a href="#">Small House</a></li>
		<br></br>
		<li><a href="#">Hostel</a></li>
	</ul>
</div>
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
@import '../assets/css/homepage/style.css';
</style>
