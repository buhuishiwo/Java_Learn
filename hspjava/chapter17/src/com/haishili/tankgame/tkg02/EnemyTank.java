package com.haishili.tankgame.tkg02;

import java.util.Random;
import java.util.Vector;

public class EnemyTank extends Tank implements Runnable {
    Vector<Shot> shots = new Vector<>();
    public EnemyTank(int x, int y) {
        super(x, y);
    }

    /**
     * 敌人坦克需要自动移动，那么就得把坦克当作一个线程，在线程中执行自动移动操作
     */
    @Override
    public void run() {
        setSpeed(5);
        Shot shot = null;
        //判断坦克是否存活
        while(isLive){
            Random rand = new Random();
            switch (getDirect()) {
                case 0:
                    for(int i = 0;i < rand.nextInt(100);i++){
                        if(getY()>0){
                            moveUp();
                        }

                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    //坦克自动射击
                    shot = new Shot(getX()+20,getY(),0);
                    shots.add(shot);
                    new Thread(shot).start();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    for(int i = 0;i < rand.nextInt(100);i++){
                        if(getY() +60 < 750){
                            moveDown();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    shot = new Shot(getX() + 20, getY() + 60, getDirect());
                    shots.add(shot);
                    new Thread(shot).start();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 3:
                    for(int i = 0;i < rand.nextInt(100);i++){
                        if(getX()>0){
                            moveLeft();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    shot = new Shot(getX(),getY()+20,3);
                    shots.add(shot);
                    new Thread(shot).start();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 1:
                    for(int i = 0;i < rand.nextInt(100);i++){
                        if(getX()+ 60 < 1000) {
                            moveRight();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    shot = new Shot(getX()+60,getY()+20,1);
                    shots.add(shot);
                    new Thread(shot).start();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            setDirect(rand.nextInt(4));
        }
    }
}
