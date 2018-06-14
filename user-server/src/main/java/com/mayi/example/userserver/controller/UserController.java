package com.mayi.example.userserver.controller;

import com.mayi.example.userserver.model.UserModel;
import com.mayi.example.userserver.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;
    @RequestMapping(value = "/getUserByAccount",method = RequestMethod.POST)
    public UserModel getUserByAccount(@RequestParam("account") String account){
        UserModel user = userService.getUserByAccount(account);
        return user;
    }
}
