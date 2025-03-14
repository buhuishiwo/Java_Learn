package com.haishili.final_;

public class Final01 {
    /**
     * final关键字不允许被修饰的类，属性，方法被修改/继承
     */
//    public final int a = 10;
//    public Final01(int a) {
//        this.a = a;
//    }

    public final int MAX_RENT = 9;
    public final int MAX_RENT2;
    public final static int MAX_RENT3;

    static {
        MAX_RENT3 = 2;
    }

    public Final01() {
        MAX_RENT2 = 1;
    }
}
