package com.example.demo.config;

import com.example.demo.common.AppVariable;
import com.example.demo.entity.Userinfo;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {



    //当返回是true的时候，用户已登陆
    //false 用户未登陆
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession(false);
        if(session!=null && session.getAttribute(AppVariable.USER_SESSION_KEY)!=null){

            //用户已登陆
            System.out.println("当前登陆用户为:"+
                    ((Userinfo)session.getAttribute(AppVariable.USER_SESSION_KEY)).getUsername());
            return true;
        }
        //未登陆要转到登陆页面
        response.sendRedirect("/login.html");
        //这样的话普通拦截器就写完了
        return false;

    }
}
