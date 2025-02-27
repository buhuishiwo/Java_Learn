package com.haishili.homework;

public class Homework02 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Thread thread = new Thread(bank);
        thread.setName("李四");
        thread.start();
        Thread thread1 = new Thread(bank);
        thread1.setName("王五");
        thread1.start();
    }
}

class Bank implements Runnable {
    private double balance = 10000.0;
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            synchronized (this) {
                if (balance <= 0) {
                    System.out.println("卡片余额不足，退出取款");
                    loop = false;
                    return;
                }
                balance = balance - 1000;
                System.out.println("用户" + Thread.currentThread().getName() + "取出1000元" + "还剩" + balance);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}