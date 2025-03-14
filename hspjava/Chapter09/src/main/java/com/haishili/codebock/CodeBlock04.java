package com.haishili.codebock;

public class CodeBlock04 {
    public static void main(String[] args) {
//        System.out.println(Son.son);
//        System.out.println();
//        Son son = new Son();
        System.out.println("total= " +Person.total);
        System.out.println("total= " +Person.total);
    }
}

class Father{

    public static int num = getNum();

    static {
        System.out.println("父类静态代码块被调用");
    }

    public static int getNum() {
        System.out.println("父类静态方法被调用");
        return 100;
    }

    public Father() {

        System.out.println("父类无参构造被调用");
    }
}

class Person {
    public static int total;
    static {
        total = 100;
        System.out.println("静态代码快被调用");
    }
}

class Son extends Father {

    public static int son = getSon();

    public static int getSon() {
        System.out.println("子类静态方法被调用");
        return 200;
    }

    public void getsta() {
        getSon();
    }

    {
        System.out.println("子类普通代码块被调用");
    }

    public Son() {
        getsta();
        System.out.println("子类无参构造被调用");
    }
}
