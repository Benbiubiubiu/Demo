package com.test.controller;

import com.test.pojo.Book;
import com.test.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * author:Ben
 */
@RestController
public class BookController {
    @Resource
    BookService service;

    @RequestMapping("/book/{bid}")
    Book findBookById(@PathVariable("bid") int bid){
        return service.getBookById(bid);
    }
}
