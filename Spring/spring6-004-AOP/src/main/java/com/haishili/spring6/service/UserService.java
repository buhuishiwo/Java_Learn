package com.haishili.spring6.service;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
    public void login() {
        System.out.println("用户登录中........");
    }
}
