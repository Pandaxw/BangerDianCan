function sub(productid) {
    var json={productid:productid,}
    $.ajax({
        type: "POST",
        url: "/Car/addTocar",
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify(json),
        dataType: "json",
        success: function (message) {
            if (message > 0) {
                alert("请求已提交！我们会尽快与您取得联系");
            }
        },
        error: function (message) {

        }
    });
}
function updata(productid,productnum) {
    var json= {productid:productid,productnum:productnum,};
    $.ajax({
        type: "POST",
        url: "/Car/updataMycar",
        contentType: "application/json; charset=utf-8",
        data:JSON.stringify(json),
        success: function (message) {
            if (message > 0) {
                alert("请求已提交！我们会尽快与您取得联系");
            }
        },
        error: function (message) {
        }
    });
}
function removeProduct(productid) {
    var json= {productid:productid};
    $.ajax({
        type: "POST",
        url: "/Car/removeMycar",
        contentType: "application/json; charset=utf-8",
        data:JSON.stringify(json),
        dataType: "json",
        success: function (message) {
            if (message > 0) {
                alert("请求已提交！我们会尽快与您取得联系");
            }
        },
        error: function (message) {
        }
    });
}
$(document).ready(function(){


    $("#shoptable").on('keyup','.tr1-text',function () {
        var va=$(this).val();
        $(this).val(va.replace(/\D|^0/g,''));
    });

});