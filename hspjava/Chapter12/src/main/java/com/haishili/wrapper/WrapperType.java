package com.haishili.wrapper;

public class WrapperType {
    public static void main(String[] args) {
//        Double d = 10d;
//        Float f = 10f;
//        System.out.println(f+" "+d);

        Object obj1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(obj1);
    }
}
