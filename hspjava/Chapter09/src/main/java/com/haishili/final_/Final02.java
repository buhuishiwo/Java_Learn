package com.haishili.final_;

public class Final02 {
    public static void main(String[] args) {
        System.out.println(BBB.num);
    }
}

class BBB {
    //final和 static 同时使用不会导致类加载
    public final static int num = 100;
    static {
        System.out.println(num);
    }
}
