package com.test.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


/**
 * author:Ben
 */
@Data
@AllArgsConstructor
public class UserBorrowDetail {
    User user;
    List<Book> bookList;
}
