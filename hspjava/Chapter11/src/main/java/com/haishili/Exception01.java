package com.haishili;

public class Exception01 {
    public static void main(String[] args) {
        //对代码进行异常处理，是的程序在出现一些非致命错误也能继续运行
        try {
            int res = 100/0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
