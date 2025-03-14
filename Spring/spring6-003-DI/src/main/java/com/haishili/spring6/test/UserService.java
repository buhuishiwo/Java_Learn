package com.haishili.spring6.test;


public class UserService {
    private User user;
    private int age;
    public void setAge(int age) {
        this.age = age;
    }
    public void setUserDao(User userDao) {
        this.user = userDao;
    }
    public void addUser() {
        System.out.println(age);
        user.add();
    }
}
