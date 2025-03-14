package com.haishili.runableuse;

public class Runable01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread t1 = new Thread(dog);
        t1.start();
        Pig pig = new Pig();
        new ThreadProxy(pig).start();
    }
}

class Pig implements Runnable{
    public void run() {
        while(true) {
            System.out.println("Pig");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class ThreadProxy implements Runnable{
    private Runnable target;
    public ThreadProxy(Runnable target){
        this.target = target;
    }
    public void run(){
        if(target != null){
            target.run();
        }
    }
    public void start0(){
        run();
    }
    public void start(){
        start0();
    }
}

class Dog implements Runnable {
    public void run() {
        while (true) {
            System.out.println("狗叫");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
