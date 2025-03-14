package com.haishili.spring6.service;

import org.springframework.stereotype.Service;
//声明 Bean 注解
@Service("userService")
public class UserService {
    public void login() {
        System.out.println("用户登录中........");
//        if(1 == 1) {
//            throw new RuntimeException("This is exception");
//        }
    }
}
