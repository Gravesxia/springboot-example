package com.mayi.example.homeserver.feign;

import com.mayi.example.homeserver.model.UserModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user-server")
public interface SchedualUserServer {
    /**
     * 根据登录账户查询学生信息
     * @param account
     * @return
     */
    @RequestMapping(value = "/user/getUserByAccount",method = RequestMethod.POST)
    UserModel getUserByAccount(@RequestParam("account") String account);
}
