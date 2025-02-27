package com.haishili.method;

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T1 t = new T1();
        t.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("hello");
            Thread.sleep(1000);
            if (i == 5) {
                t.join();
            }
        }

    }
}

class T1 extends Thread {
    private int count = 0;

    public int getCount() {
        return count;
    }
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while(loop){
            System.out.println("hi"+count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count++;
            if(count == 20){
                loop = false;
            }
        }

    }
}