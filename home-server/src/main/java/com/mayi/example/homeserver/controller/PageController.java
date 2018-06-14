package com.mayi.example.homeserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/index")
public class PageController {

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }


    @RequestMapping("/logout")
    public void logout(HttpSession session, HttpServletResponse response) throws Exception{
        session.removeAttribute("userSession");
        //重定向到首页
        response.sendRedirect("/");
    }

}
