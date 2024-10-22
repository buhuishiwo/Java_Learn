package com.haishili.codebock;

public class CodeBock01 {
    public static void main(String[] args) {
        new Code("李明");
        new Code("王五",100);
        
    }
}
class Code {
    private String name;
    private int price;
   static  {
        System.out.println("屏幕打开");
        System.out.println("广告开始");
        System.out.println("广告结束");
        System.out.println("电影开始");
    }

    public Code(String name) {
        this.name = name;
    }
    public Code(String name, int price) {
        this.name = name;
        this.price = price;
    }
}