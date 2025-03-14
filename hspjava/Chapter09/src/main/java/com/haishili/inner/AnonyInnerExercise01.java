package com.haishili.inner;

public class AnonyInnerExercise01 {
    public static void main(String[] args) {
        f1(new I() {
            @Override
            public void say() {
                System.out.println("这是匿名内部类");
            }
        });
    }
    public static void f1(I i) {
        i.say();
    }
}

class Car {

    public static void f1(I i) {
        i.say();
    }
}

interface I {
    void say();
}
