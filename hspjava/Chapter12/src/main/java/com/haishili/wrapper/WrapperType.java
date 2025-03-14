package com.haishili.wrapper;

public class WrapperType {
    public static void main(String[] args) {
//        Double d = 10d;
//        Float f = 10f;
//        System.out.println(f+" "+d);
        /*
        *三元运算符是一种 表达式，它必须有一个确定的返回类型。在 a ? b : c 表达式中，如果 b 和 c 的类型不同，
        *Java 会根据类型转换的规则将 b 和 c 提升为一个共同的父类型，这样整个表达式才能有一个确定的类型。
        * */
//        Object obj1 = true ? new Integer(1) : new Double(2.0);
//        System.out.println(obj1);
        //包装类（Integer）-> String
        Integer i = 100;
        //方法一
        String str1 = i + "";
        //方法二
        String str2 = i.toString();
        //方法三
        String str3 = String.valueOf(i);

        //String -> 包装类（ Integer）
        String str4 = "1234";
        //方法一
        Integer i2 = Integer.parseInt(str4);
        //方法二
        //此方法已被弃用
        Integer i3 = new Integer(str4);
    }
}
