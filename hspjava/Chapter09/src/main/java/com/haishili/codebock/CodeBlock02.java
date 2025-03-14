package com.haishili.codebock;

public class CodeBlock02 {
    public static void main(String[] args) {
        A a = new A(10);
        System.out.println(a.b);
    }
}

class A {
    /*
    * 当同时出现了静态变量、静态方法和静态代码块
    * 它们按照先定义先执行的顺序执行
    * 普通代码也是类似的规则
    * */

    public int b = getB();

    {
        System.out.println("普通代码块被调用");
    }

    static {
        System.out.println("静态代码块被调用");
    }

    public static int a = getA();

    public static int  getA() {
        System.out.println("getA被调用");
        return 100;
    }

    public int getB() {
        System.out.println("普通方法被调用");
        return 200;
    }

    public A(int b) {
        this.b = b;
        System.out.println("无参构造被调用");
    }
}
