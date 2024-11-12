package com.haishili.stringbuffer;

public class StringBuffer01 {
    public static void main(String[] args) {
        //无参构造创建 StringBuffer 对象会创建一个容量为 16的 char[]
        StringBuffer stringBuffer = new StringBuffer();
        //通过构造器指定 char[]大小
        StringBuffer stringBuffer1 = new StringBuffer(100);
        //通过给定 String 创建

        StringBuffer stringBuffer2 = new StringBuffer("hello");
    }
}
