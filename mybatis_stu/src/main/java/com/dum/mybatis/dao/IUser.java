package com.dum.mybatis.dao;

import com.dum.mybatis.models.User;
import org.apache.ibatis.annotations.Select;

/**
 * @Auther : Dumpling
 * @Description
 **/
public interface IUser {
    @Select("select * from user where id = #{id}")
    public User getUserByID(int id);
}
