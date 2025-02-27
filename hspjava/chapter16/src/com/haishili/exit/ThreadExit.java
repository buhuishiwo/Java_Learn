package com.haishili.exit;

public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {
        T t1 = new T();
        t1.start();

        Thread.sleep(5*1000);
        t1.setLoop(false);
    }
}

class T extends Thread {
    private boolean loop = true;
    @Override
    public void run() {
        while(loop){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("T线程运行中....");
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}