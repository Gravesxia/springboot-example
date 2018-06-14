package com.mayi.example.userserver.service.impl;

import com.mayi.example.userserver.dao.IUserDao;
import com.mayi.example.userserver.model.UserModel;
import com.mayi.example.userserver.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    @Autowired
    private IUserDao userDao;

    public UserModel getUserByAccount(String account) {
        return userDao.getUserByAccount(account);
    }

}
