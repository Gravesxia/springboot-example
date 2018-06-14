package com.mayi.example.homeserver.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/index")
    public ModelAndView home(HttpSession session){
        Object obj = session.getAttribute("userSession");
        ModelAndView mv = new ModelAndView("/home");
        mv.addObject("user",obj);
        return mv;
    }
}
