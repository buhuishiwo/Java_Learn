package com.haishili.method;

public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("王五");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("hi");
        }
        t.interrupt();
    }
}

class T extends Thread {
    public void run() {
        while(true){
            for (int i = 0; i <100 ; i++) {

                System.out.println(Thread.currentThread().getName()+"吃包子"+i);
            }
            try {
                System.out.println(Thread.currentThread().getName()+"休眠中");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+"被中断了");
            }
        }
    }
}