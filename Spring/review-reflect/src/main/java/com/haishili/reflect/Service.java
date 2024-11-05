package com.haishili.reflect;

public class Service {
    public void dosome() {
        System.out.println("dosome()执行");
    }
    public String dosome(String name) {
        System.out.println("dosome(String name)执行");
        return name;
    }
    public String dosome(String name, int age) {
        System.out.println("dosome(String name int age)执行");
        return name + age;
    }
}
