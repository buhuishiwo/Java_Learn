package com.haishili.spring6.bean;

//Bean 生命周期的五步法
//第一步：实例化Bean
//第二步：Bean属性赋值
//第三步：初始化Bean
//第四步：使用Bean
//第五步：销毁Bean

//Bean生命周期的七步法
//第一步：实例化Bean
//第二步：Bean属性赋值
//Bean后处理器 before
//第三步：初始化Bean
//Bean 后处理器 after
//第四步：使用Bean
//第五步：销毁Bean
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
