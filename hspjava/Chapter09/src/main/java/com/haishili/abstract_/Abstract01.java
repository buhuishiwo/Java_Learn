package com.haishili.abstract_;

public class Abstract01 {
    public static void main(String[] args) {
        //抽象类不能被实例化
        Cat cat = new Cat("猫");
        cat.eat();
    }
}
abstract class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    //抽象类，没有方法体，由其子类重写
    public abstract void eat();
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void eat() {
        System.out.println("猫吃老鼠");
    }
}
