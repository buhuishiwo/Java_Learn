package com.haishili.method;

public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Thread thread = new Thread(myThread);
        thread.setPriority(Thread.MIN_PRIORITY);
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("hi");
            if (i == 5) {
                thread.start();
                thread.join();
            }
        }
    }
}
class MyThread implements Runnable {
    private boolean loop = true;
    private int count = 0;
    @Override
    public void run() {
        while(loop) {
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count++;
            if(count == 10) {
                loop = false;
            }
        }
    }
}
