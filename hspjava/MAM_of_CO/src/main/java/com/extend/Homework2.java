package com.extend;

public class Homework2 {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A{
    public A() {
        System.out.println("A");
    }
}

class B extends A{
    public B() {
        System.out.println("B");
    }
    public B(String a) {
        System.out.println(a);
    }
}

class C extends B{
    public C() {
        this("hello");
        System.out.println("C");
    }
    public C(String a) {
        super("hahaha");
        System.out.println(a);
    }
}