package com.dum.mybatis.models;

import lombok.Data;

/**
 * @Auther : Dumpling
 * @Description
 **/
@Data
public class User {
    private int id;
    private String name;
    private String dept;
    private String phone;
    private String website;
}
