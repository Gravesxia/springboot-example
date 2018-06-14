package com.mayi.example.homeserver.controller;

import com.mayi.example.homeserver.feign.SchedualUserServer;
import com.mayi.example.homeserver.model.UserModel;
import com.mayi.example.homeserver.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    SchedualUserServer schedualUserServer;

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String loginIn(HttpServletRequest request){
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        //查询用户信息
        UserModel user = schedualUserServer.getUserByAccount(account);
        if(user != null && MD5Util.compareMd5(password,MD5Util.md5Password("abc123"))){
            request.getSession().setAttribute("userSession",user);
            UserModel user1 = (UserModel)request.getSession().getAttribute("userSession");
            return "success";
        }
        return "error";
    }

}
