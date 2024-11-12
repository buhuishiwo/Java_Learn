package com.haishili.math_;

public class MathMethod {
    public static void main(String[] args) {
        //取绝对值
        int abs = Math.abs(-10);
        System.out.println(abs);
        //求幂
        double pow = Math.pow(10, -10);
        System.out.println(pow);
        //向上取整
        double ceil = Math.ceil(1.542);
        System.out.println(ceil);
        //向下取整
        double floor = Math.floor(3.942);
        System.out.println(floor);
        //四舍五入
        long round = Math.round(1.542);
        System.out.println(round);
        //求开方
        double sqrt = Math.sqrt(9.0);
        System.out.println(sqrt);
        //返回随机数
        //求 a 到 b 之间的随机数
        // int num = (int)(Math.random()*(b-a+1)+a);
        int num = (int) (Math.random()*(10-2+1)+2);
        System.out.println(num);
    }
}
