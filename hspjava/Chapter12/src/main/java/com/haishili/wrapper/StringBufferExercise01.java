package com.haishili.wrapper;

public class StringBufferExercise01 {
    public static void main(String[] args) {
        String s= null;
        //这里通过看 append 的源码可知，当传入是 null 时，就会返回 appendNull()
        //appendNull()会返回 null 给 append
        StringBuffer append = new StringBuffer().append(s);
        System.out.println(append.length());
        System.out.println(append);

        //这里会报错，因为传入的 s 是个空值
        StringBuffer stringBuffer = new StringBuffer(s);
        System.out.println(stringBuffer);
    }
}
