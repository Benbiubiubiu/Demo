package com.test.service;

import com.test.pojo.UserBorrowDetail;

/**
 * author:Ben
 */
public interface BorrowService {
    UserBorrowDetail getUserBorrowDetailByUid(int uid);
}
