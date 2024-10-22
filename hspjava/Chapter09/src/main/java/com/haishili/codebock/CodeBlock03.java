package com.haishili.codebock;

public class CodeBlock03 {

    public static void main(String[] args) {
        BBB bbb = new BBB();
    }

}

class AAA {

    {
        System.out.println("AAA 代码块被调用");
    }

    public AAA() {
        System.out.println("AAA的无参构造被调用");
    }
}

class BBB extends AAA {

    {
        System.out.println("BBB代码块被调用");
    }

    public BBB() {
        //super();
        //本类代码块
        System.out.println("BBB的无参构造被调用");
    }
}