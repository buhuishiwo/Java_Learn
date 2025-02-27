package com.haishili.threaduse;

public class Thread02 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        new Thread(t1).start();
        T2 t2 = new T2();
        new Thread(t2).start();
    }
}

class T1 implements Runnable{

    int count = 0;
    @Override
    public void run() {
        while(true)
        {
            System.out.println("hello world");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count++;
            if(count == 10)
            {
                break;
            }
        }

    }
}

class T2 implements Runnable{

    int count = 0;
    @Override
    public void run() {
        while(true)
        {
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count++;
            if(count == 5)
            {
                break;
            }
        }

    }
}