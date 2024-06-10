package com.test.service.impl;

import com.test.mapper.BookMapper;
import com.test.pojo.Book;
import com.test.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * author:Ben
 */
@Service
public class BookServiceImpl implements BookService {
    @Resource
    BookMapper mapper;
    @Override
    public Book getBookById(int bid) {
        return mapper.getBookById(bid);
    }
}
