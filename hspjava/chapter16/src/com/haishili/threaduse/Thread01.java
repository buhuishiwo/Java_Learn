package com.haishili.threaduse;

public class Thread01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.start();
    }
}

class Cat extends Thread {
    @Override
    public void run() {
        while(true){
            System.out.println("喵喵，我是小猫咪");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}