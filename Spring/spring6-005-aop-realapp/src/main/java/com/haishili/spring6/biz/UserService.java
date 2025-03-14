package com.haishili.spring6.biz;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
    public void addUser() {
        System.out.println("新增用户信息");
    }
    public void deleteUser() {
        System.out.println("删除用户信息");
    }
    public void updateUser() {
        System.out.println("更改用户信息");
    }
    public void seachUser() {
        System.out.println("查找用户信息");
    }
}
