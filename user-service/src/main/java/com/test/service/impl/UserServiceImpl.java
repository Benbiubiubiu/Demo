package com.test.service.impl;

import com.test.mapper.UserMapper;
import com.test.pojo.User;
import com.test.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * author:Ben
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper mapper;

    @Override
    public User getUserById(int uid) {
        return mapper.getUserById(uid);
    }
}
