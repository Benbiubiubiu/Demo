package com.test.controller;

import com.test.pojo.User;
import com.test.service.UserService;
import com.test.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * author:Ben
 */
@RestController
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/user/{uid}")
    public User findUserById(@PathVariable("uid") int uid){
        return userService.getUserById(uid);
    }

}
