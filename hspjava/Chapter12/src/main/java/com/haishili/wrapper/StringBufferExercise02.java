package com.haishili.wrapper;

import java.util.Scanner;

public class StringBufferExercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入商品名");
        String name = scanner.nextLine();
        StringBuffer sb = new StringBuffer(name);
        System.out.println("输入价格");
        String price = scanner.nextLine();
        StringBuffer sb1 = new StringBuffer(price);
//        System.out.println(sb+" "+sb1);
        for (int i = sb1.lastIndexOf("."); i > 0 ; i-=3) {
            sb1.insert(i,',');
        }
        System.out.println(sb+" "+sb1);
    }
}
