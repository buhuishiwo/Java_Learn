package com.haishili.string;

public class String01 {
    public static void main(String[] args) {
        //String 类实现了 Serializable 接口，表示 string 可以串行化，可以在网络传输
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s4 == s4.intern());
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}
