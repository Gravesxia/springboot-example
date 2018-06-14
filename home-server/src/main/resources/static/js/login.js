$(function(){
    $("#login-in").on("click",function(){
        var obj = $('#login').serialize();
        $.ajax({
            type: "post",
            url: "/login",
            data: obj,// 要提交的表单
            success: function (res) {
                if(res == "success"){
                    window.location = "/home";
                }else{
                    alert("用户名或密码错误");
                }
            },
            error: function (error) {
                alert("登录失败");
            }
        });
    });
});