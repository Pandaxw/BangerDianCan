var seller_id=1001;

findpartProList(1);
var totalPage;

/*分页获取商品列表*/
function findpartProList(page){

var seller_id=1001;
var currpage=page;
//$("#weiye").attr("href","javascript:findpartProList(totalPage)"); 
$.post('seller/findProList',{"sellerid":seller_id,"page":currpage},function(data){	
	var products=data.rows;
	 totalPage=data.totalPage;
	//alert(data.totalPage+"hha")
	
	$("#menu_table").empty();
	var str="";
	for(var i=0;i<products.length;i++){
		
		str+="<tr class='tr1'>" +
		"<td style='width:70px;'><input type='checkbox' name='checkbox_hfz' class='col' value='"+products[i].productId+"'/></td>" +
		"<td><a href='admindetails.html'>"+products[i].productName+"</a></td>" +
		"<td>￥<em>"+products[i].productPrice+"</em></td><td>"+(products[i].productIsSell==0?"上架":"下架" )+" </td>"+	
		"<td><button onclick='editIsSell(\""+products[i].productId+"\")'>"+(products[i].productIsSell==0?"下架":"上架" )+"</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button onclick='modifyproduct(\""+products[i].productId+"\")' class='2'>修改商品</button></td></tr>";
	}
	$("#menu_table").append(str);
},"json");

$("#pagetext").val(totalPage);
	
}


/*修改商品上下架*/
function editIsSell(proid){
	$.post('seller/editIsSell',{"proid":proid},function(data){
		if(data){
			alert("恭喜你修改成功");
			findpartProList(1);
		}
	},"json")

	
}


/*进入尾页*/
function gotoendList(){
	findpartProList(totalPage);
	
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

function remove(obj){
	$(obj).parent().remove();
}

function addproduct(){
	var productName=$("#productName").val();
	var productPrice=$("#productPrice").val();
	var productStock=$("#productStock").val();
	var productIsSell=$("input[name='productIsSell']:checked").val();
	var productTaste=$("input[name='productTaste']:checked").val();
	var productDescription=$("#productDescription").val();
	var productSellerId=seller_id;
	var imglistsrc="";
	
	var imglist=$(".imglist");
	for(var i=0;i<imglist.length;i++){
		var temp=($(".imglist")[i].src)+","
		
		 imglistsrc=temp.substring(21,temp.length)+imglistsrc;
		/*/zxdImg/1.jpg/zxdImg/3.jpg/zxdImg/6.jpgundefined*/
		
	}
	

	
	$.post("seller/addpro",{"productName":productName,"productPrice":productPrice,"productStock":productStock,"productIsSell":productIsSell,"productTaste":productTaste,"productDescription":productDescription,"productSellerId":productSellerId,"imglistsrc":imglistsrc},function(data){
		if(data){
			alert("恭喜你添加成功");
		}
		
	},"json")
}

/*修改商品列表*/
function modifyproduct(proid){
	
	window.location.href="seller_goodedit.vm?proid="+proid+"";
	
}

/*删除商品*/
function delproduct(){
	  var productid ="";
      $('input:checkbox[name=checkbox_hfz]:checked').each(function(i){
    	  productid=$(this).val();
    	  $.post("seller/delproduct",{"productId":productid},function(data){
    		  if(data){
    			  alert("恭喜你删除成功");
    			  findpartProList(1);
    		  }
    	  },"json")
    	  
      });
	
}









