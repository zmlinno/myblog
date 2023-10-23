package com.example.demo.mapper;
import com.example.demo.entity.Userinfo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    int reg(Userinfo userinfo);
    //这个方法是进行注册的
    // 更优的写法，建议去传对象
    //创建好唯一约束是我们写这个方法的基础
    //没有这个唯一约束的话，那么同一个用户名就可以创造无数条
    //那么在接收的时候就会报错
    //根据用户名查询user对象
    Userinfo getUserByName(@Param("username") String username);

    ////今天加的
    Userinfo getUserById(@Param("id")Integer id);



}
