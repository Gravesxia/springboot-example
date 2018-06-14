package com.mayi.example.userserver.dao;


import com.mayi.example.userserver.model.UserModel;

import java.util.List;

public interface IUserDao {
    UserModel getUserByAccount(String account);

    Integer registerUser(UserModel userModel);
}
