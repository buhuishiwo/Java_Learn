package com.haishili.spring6.bean;

//Bean 生命周期的五步法
public class User {
    private String name;

    public User() {
        System.out.println("1.实例化 Bean");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2.给 Bean 赋值");
    }

    public void initBean() {
        System.out.println("3.初始化 Bean");
    }

    public void destroyBean() {
        System.out.println("5.销毁 Bean");
    }
}
