package com.test.mapper;

import com.test.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * author:Ben
 */
@Mapper
public interface UserMapper {
    @Select("select * from DB_USER where uid = #{uid}")
    User getUserById(int uid);
}
