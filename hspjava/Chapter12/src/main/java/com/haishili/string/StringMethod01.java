package com.haishili.string;

public class StringMethod01 {
    public static void main(String[] args) {
        String s1 = "hale";
        //获取字符在字符串中第一次出现的位置
        System.out.println(s1.indexOf('e'));//3
        //获取字符在字符串中最后一次出现的位置
        System.out.println(s1.lastIndexOf('e'));//3
        //返回指定字符串在原字符串中第一次开始出现的位置
        System.out.println(s1.indexOf("al"));
        //从索引 2 开始（包括 2）截取之后所有的内容
        System.out.println(s1.substring(2));//le
        //从索引 0 开始截取，截取到索引 4-0=0 的位置
        System.out.println(s1.substring(0, 4));//hale
    }
}
