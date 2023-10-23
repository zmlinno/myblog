package com.example.demo.common;


import com.example.demo.entity.Userinfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

//这是一个工具集
//和当前登陆用户相关的操作
public class UserSessionUtils {
    public static Userinfo getUser(HttpServletRequest request){
        //得到当前的登陆用户
        HttpSession session = request.getSession(false);
        if(session!=null &&
                session.getAttribute(AppVariable.USER_SESSION_KEY)!=null){
            //说明用户已经正常登陆了
            return (Userinfo) session.getAttribute(AppVariable.USER_SESSION_KEY);
        }
        return null;

    }
}
