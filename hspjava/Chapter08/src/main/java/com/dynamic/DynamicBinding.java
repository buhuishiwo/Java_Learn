package com.dynamic;

public class DynamicBinding {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.sound();
    }
}

class Animal {
    public int i = 10;
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        i = 20;
        System.out.println("Cat meows"+i);
    }
}


