package com.haishili.homework;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2(t1);
        t1.start();
        t2.start();
    }
}

class T1 extends Thread {

    public boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while(loop) {
            Random random = new Random();
            int randomNum = random.nextInt(100)+1;
            System.out.println(randomNum);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class T2 extends Thread{
    private T1 t1;

    public T2(T1 t1) {
        this.t1 = t1;
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        while(true) {
            char c = scanner.next().toUpperCase().charAt(0);
            if(c == 'Q') {
                t1.setLoop(false);
                break;
            }
        }
    }

}