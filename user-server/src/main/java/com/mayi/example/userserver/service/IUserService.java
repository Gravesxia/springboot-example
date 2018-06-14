package com.mayi.example.userserver.service;

import com.mayi.example.userserver.model.UserModel;


public interface IUserService{
    UserModel getUserByAccount(String account);
}
