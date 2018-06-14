package com.mayi.example.homeserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class PageController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/home")
    public ModelAndView home(HttpSession session){
        Object obj = session.getAttribute("userSession");
        ModelAndView mv = new ModelAndView("/home");
        mv.addObject("user",obj);
        return mv;
    }
    @RequestMapping("/logout")
    public void logout(HttpSession session, HttpServletResponse response) throws Exception{
        session.removeAttribute("userSession");
        //重定向到首页
        response.sendRedirect("/");
    }

}
