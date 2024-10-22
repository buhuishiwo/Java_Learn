package com.haishili.static_;

public class ChildGame {
    public static void main(String[] args) {
        Child child = new Child("这是");
        Child.count++;
        Child child2 = new Child("李明");
        Child.count++;
        System.out.println(Child.count);
    }

}
class Child {
    private String name;
    public static int count = 0;
    public Child(String name) {
        this.name = name;
    }
}