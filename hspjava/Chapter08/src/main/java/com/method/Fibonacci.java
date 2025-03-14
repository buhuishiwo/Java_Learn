package com.method;

public class Fibonacci {
    public static void main(String[] args) {
        Fi fi = new Fi();
        System.out.println(fi.fibonacci(3));
    }

}

class Fi {
    public static int fibonacci(int n) {
        if(n == 1|| n == 2) {
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
