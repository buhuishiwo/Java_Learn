package com.method;

public class Person {
    public int age;
    public String name;
}
class Huang{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 10;
        p1.name="黄夫人";
        Person p2 = p1;
        System.out.println(p2.name);
        p2.age = 20;
        p2 = null;
        System.out.println(p1.age);
        System.out.println(p2.age);
    }
}

