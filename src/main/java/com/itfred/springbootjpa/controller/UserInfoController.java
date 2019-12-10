package com.itfred.springbootjpa.controller;

import com.itfred.springbootjpa.entity.UserInfo;
import com.itfred.springbootjpa.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserInfoController {
    @Autowired
    UserInfoRepository userInfoRepository;

    @GetMapping(value = "getUserInfoById/{id}")
    public UserInfo getUserInfoById(@PathVariable("id")Integer id){
//        UserInfo one = userInfoRepository.findById(id).orElse(null);
        UserInfo one = userInfoRepository.findById(id).get();
        return one;
    }
    @GetMapping(value = "insertUserInfo")
    public UserInfo insertUserInfo(UserInfo userInfo){
        UserInfo save = userInfoRepository.save(userInfo);
        return save;
    }
}
