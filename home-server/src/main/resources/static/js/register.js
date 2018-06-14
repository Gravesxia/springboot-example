$(function(){
    $("#submit").on("click",function(){
        var obj = $('#register').serialize();
        $.ajax({
            type: "post",
            url: "/api-b/user/registerUser",
            data: JSON.stringify(obj),// 要提交的表单
            success: function (res) {
                if(res == "success"){
                    alert("注册成功");
                }else{
                    alert("注册失败");
                }
            },
            error: function (error) {
                alert("注册失败");
            }
        });
    });
});