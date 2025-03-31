package com.haishili.tankgame.tkg01;

import com.haishili.tankgame.tkg02.EnemyTank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyPanel extends JPanel implements KeyListener,Runnable{
    Hero hero = null;
    EnemyTank enemy1 = null;
    EnemyTank enemy2 = null;
    EnemyTank enemy3 = null;
    public MyPanel() {
        hero = new Hero(200,400);
        enemy1 = new EnemyTank(100,100);
        enemy2 = new EnemyTank(200,100);
        enemy3 = new EnemyTank(300,100);
        hero.setSpeed(5);
        enemy1.setSpeed(1);
        enemy2.setSpeed(1);
        enemy3.setSpeed(1);
    }
    public void paint(Graphics g) {
        super.paint(g);
        if(hero.shot!=null && hero.shot.isLive) {
            System.out.println("子弹被绘制");
            g.draw3DRect(hero.shot.getX(),hero.shot.getY(),1,1,false);
        }
        drawTank(hero.getX(), hero.getY(), g,hero.getDirect(),0);
        drawTank(enemy1.getX(),enemy1.getY(),g,enemy1.getDirect(),1);
        drawTank(enemy2.getX(),enemy2.getY(),g,enemy2.getDirect(),1);
        drawTank(enemy3.getX(),enemy3.getY(),g,enemy3.getDirect(),1);


    }

    /**
     *
     * @param x 横坐标
     * @param y 纵坐标
     * @param g 画笔
     * @param direct 坦克反向（上下左右）
     * @param type 坦克类型（敌我）
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0://我
                g.setColor(Color.blue);
                break;
            case 1://敌
                g.setColor(Color.red);
                break;
        }

        //direct 0 1 2 3 分别表示上右下左
        switch (direct) {
            case 0://表示向上
                g.fill3DRect(x, y, 10,60,false);
                g.fill3DRect(x+30, y, 10,60,false);
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);
                g.drawLine(x+20,y,x+20,y+30);
                break;
            case 1:
                g.fill3DRect(x, y, 60,10,false);
                g.fill3DRect(x, y+30, 60,10,false);
                g.fill3DRect(x+10,y+10,40,20,false);
                g.fillOval(x+20,y+10,20,20);
                g.drawLine(x+30,y+20,x+60,y+20);
                break;
            case 2://表示向下
                g.fill3DRect(x, y, 10,60,false);
                g.fill3DRect(x+30, y, 10,60,false);
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);
                g.drawLine(x+20,y+30,x+20,y+60);
                break;
            case 3:
                g.fill3DRect(x, y, 60,10,false);
                g.fill3DRect(x, y+30, 60,10,false);
                g.fill3DRect(x+10,y+10,40,20,false);
                g.fillOval(x+20,y+10,20,20);
                g.drawLine(x+30,y+20,x,y+20);
                break;
            default:
                System.out.println("默认配置");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_W) {
            hero.setDirect(0);
            hero.moveUp();
        }else if(e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            hero.moveDown();
        }else if(e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            hero.moveLeft();
        }else if(e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            hero.moveRight();
        }
        if(e.getKeyCode() == KeyEvent.VK_J) {
            hero.ShotGun();
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.repaint();
        }

    }
}
