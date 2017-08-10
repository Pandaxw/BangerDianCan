function GetQueryString(name)
{
     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
     var r = window.location.search.substr(1).match(reg);
     if(r!=null)return  unescape(r[2]); return null;
}

var productId=GetQueryString("proid");

$.post("seller/findproductmsg",{"productId":productId},function(data){
	
	$("#proname").empty();
	$("#proprice").empty();
	$("#prostock").empty();
	$("#protaste").empty();
	$("#proissell").empty();
	$("#prodescri").empty();
	$("#proname").append("<h1 style='text-align:center; font-size:14px;'>"+data.productName+"</h1>")
	$("#proprice").append("<a>单价</a><em style='font-size:26px; padding-right:20px;'>￥</em><em style='color:#FF9562; font-weight:bold; font-size:26px; '>"+data.productPrice+"</em>")
	$("#prostock").append("<span><a>库存</a><em>"+data.productStock+"</em>份</span>")
	$("#protaste").append("<span><a>口味:</a>"+(data.productTaste==0?'辣':'不辣')+"</span>")
	$("#proissell").append(" <span><a>是否上架</a><a>"+(data.productIsSell==0?'是 ':'否')+"</a></span>")
	$("#prodescri").append("<p>"+data.productDescription+"</p>")
	
	
	
	
	$("#productName").val(data.productName);
	$("#productPrice").val(data.productPrice);
	$("#productStock").val(data.productStock);
	if(data.productIsSell==0){
		$("input[name='productIsSell']").get(0).checked=true;
	}else{
		$("input[name='productIsSell']").get(1).checked=true;
	}
	
	if(data.productTaste==0){
		$("input[name='productTaste']").get(1).checked=true;
	}else{
		$("input[name='productTaste']").get(0).checked=true;
	}
	
	
	$("#productDescription").val(data.productDescription);

	
	
},"json")

$.post("seller/findproductimg",{"productId":productId},function(data){
	$("#imgdiv").empty();
	for(var i=0;i<data.length;i++){
		
		$("#ima_"+i+"").attr("href",data[i].pictureAddress);
		$("#img_"+i+"").attr("src",data[i].pictureAddress);
		$("#imgdiv").append("<a><p class='3' onclick='remove(this)'></p><img class='imglist' src='"+data[i].pictureAddress+"' style='overflow:hidden; width:100px;height:100px '/></a> ");
	}
		
	
},"json")


function remove(obj){
	$(obj).parent().remove();
}

function updateproduct(){
	var productName=$("#productName").val();
	var productPrice=$("#productPrice").val();
	var productStock=$("#productStock").val();
	var productIsSell=$("input[name='productIsSell']:checked").val();
	var productTaste=$("input[name='productTaste']:checked").val();
	var productDescription=$("#productDescription").val();
	var imglistsrc="";
	var imglist=$(".imglist");
	
	for(var i=0;i<imglist.length;i++){
		var temp=($(".imglist")[i].src)+","
		
		 imglistsrc=temp.substring(21,temp.length)+imglistsrc;
		/*/zxdImg/1.jpg/zxdImg/3.jpg/zxdImg/6.jpgundefined*/
		
	}
	$.post("seller/editproduct",{"productId":productId,"productName":productName,"productPrice":productPrice,"productStock":productStock,"productIsSell":productIsSell,"productDescription":productDescription,"imglistsrc":imglistsrc},function(data){
		if(data){
			
			alert("恭喜你修改成功");
		}
		
	},"json")

}

/*上传图片到本地服务器下面*/
$('#picupdateform').form({    
    url:"seller/updatepic",    
    success:function(data){    	
    	if(data!=null){
    		$("#imgdiv").append("<a><p class='3' onclick='remove(this)'></p><img class='imglist' src="+data+" style='overflow:hidden; width:100px;height:100px '/></a> ")
    	}
    }    
});









