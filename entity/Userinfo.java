package com.example.demo.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Userinfo {


    //实体类
    //本质上就是一个对象
//    private int id;
    private Integer id;
    //到底用哪个呢。建议使用Integer，因为它的功能很多
    //兼容性比int要好。
    private String username;
    private String password;
    private String photo;
    private LocalDateTime createtime;
    private LocalDateTime updatetime;
    private Integer state;


}


    //那么实体类就有了
    //就去写Mapper

