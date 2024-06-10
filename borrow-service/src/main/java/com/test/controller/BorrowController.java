package com.test.controller;

import com.test.pojo.UserBorrowDetail;
import com.test.service.BorrowService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * author:Ben
 */
@Slf4j
@RestController
public class BorrowController {
    @Resource
    BorrowService service;


    @RequestMapping("/borrow/{uid}")

    UserBorrowDetail findUserBorrows(@PathVariable("uid") int uid){
        System.out.println(uid);
        return service.getUserBorrowDetailByUid(uid);
    }
}
