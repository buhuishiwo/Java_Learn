package com.haishili.spring6.exercise;

import org.springframework.stereotype.Component;

@Component
public class UserExercise {
    public void addUser() {
        System.out.println("新增用户");
    }
    public void delUser() {
        System.out.println("删除用户");
    }
    public void updateUser() {
        System.out.println("更新用户信息");
    }
    public void SerUser() {
        System.out.println("查找用户信息");
    }
}
