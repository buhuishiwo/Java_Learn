package com.haishili.homework;

public class HomeWork02 {
    public static void main(String[] args) {
        //使用匿名内部类
        //new Cal() {
        //            @Override
        //            public void work() {
        //                System.out.println("输出值");
        //            }
        //}
        new Cellphone().testWork(new Cal() {
            @Override
            public void work( int n1 , int n2) {
                System.out.println("输出值: "+(n1+n2));
            }
        },10,10);
    }
}

interface Cal {
    void work(int n1 , int n2);
}

class Cellphone {

    public void testWork(Cal cal,int num1,int num2) {
        cal.work(num1,num2);
    }
}