$(window).load(function() {
	$('.main_box').ZalkiHoverImg();
});
$(document).ready(function() {
	$(".foot-tab ul li a").each(function() {
		$(".foot-tab ul li a").click(function() {
			$(this).addClass("foot-tab-active").css("color", " #F60")
			$(this).removeClass("foot-tab-hover")
			$(this).parent("li").siblings().children().addClass("foot-tab-hover").css("color", "#000")
			$(this).parent("li").siblings().children().removeClass("foot-tab-active")
		});
		$(".foot-tab-hover1").click(function() {
			$(this).parent().next().children().addClass("foot-tab-active").css("color", " #F60")
			$(this).parent().next().children().removeClass("foot-tab-hover")
			$(this).parent().next().siblings().children().addClass("foot-tab-hover").css("color", "#000")
			$(this).parent().next().siblings().children().removeClass("foot-tab-active")
		});
		$(".foot-tab-hover2").click(function() {
			$(this).parent().prev().children().addClass("foot-tab-active").css("color", " #F60")
			$(this).parent().prev().children().removeClass("foot-tab-hover")
			$(this).parent().prev().siblings().children().addClass("foot-tab-hover").css("color", "#000")
			$(this).parent().prev().siblings().children().removeClass("foot-tab-active")
		});
	});
});