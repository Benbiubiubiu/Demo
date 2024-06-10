package com.test.service.impl;

import com.test.mapper.BorrowMapper;
import com.test.pojo.Book;
import com.test.pojo.Borrow;
import com.test.pojo.User;
import com.test.pojo.UserBorrowDetail;
import com.test.service.BorrowService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * author:Ben
 */
@Service
public class BorrowServiceImpl implements BorrowService {
    @Resource
    BorrowMapper mapper;
    @Resource
    RestTemplate template;

    @Override
    public UserBorrowDetail getUserBorrowDetailByUid(int uid) {
        List<Borrow> borrow = mapper.getBorrowsByUid(uid);
        System.out.println(borrow);
        //这里不用再写IP，直接写服务名称userservice
        User user = template.getForObject("http://user-service/user/" + uid, User.class);
        System.out.println(user);
        //这里不用再写IP，直接写服务名称bookservice
        List<Book> bookList = borrow
                .stream()
                .map(b -> template.getForObject("http://book-service/book/" + b.getBid(), Book.class))
                .collect(Collectors.toList());
        return new UserBorrowDetail(user, bookList);
    }
}
