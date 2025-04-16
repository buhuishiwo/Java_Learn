package com.haishili.tankgame.tkg02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Vector;

/**
 * @author haishili
 */
public class MyPanel extends JPanel implements KeyListener,Runnable{
    Hero hero;
    Vector<EnemyTank> enemyTanks = new Vector<>();
    Vector<Boom> booms = new Vector<>();
    int enemyTanksSize = 3;
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    public MyPanel() {
        hero = new Hero(200,400);
        hero.setSpeed(5);
        for(int i = 0;i < enemyTanksSize; i++){
            EnemyTank enemyTank = new EnemyTank((200 * (i + 1)),0);
            new Thread(enemyTank).start();
            //给坦克添加子弹
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
            enemyTank.shots.add(shot);
            new Thread(shot).start();
            enemyTanks.add(enemyTank);

        }
        image1 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/com/haishili/tankgame/tkg02/bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/com/haishili/tankgame/tkg02/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/com/haishili/tankgame/tkg02/bomb_3.gif"));
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Shot shot : hero.shots) {
            if(shot!=null && shot.isLive) {
                g.draw3DRect(shot.getX(),shot.getY(),1,1,false);
            }
        }


        for (Boom boom : booms) {
            if(boom.life > 8) {
                g.drawImage(image1,boom.getX(),boom.getY(),60,60,this);
            }else if(boom.life > 4){
                g.drawImage(image2,boom.getX(),boom.getY(),60,60,this);
            }else{
                g.drawImage(image3,boom.getX(),boom.getY(),60,60,this);
            }
            boom.lifeDown();

            if(!boom.isLive) {
                booms.remove(boom);
            }
        }
        drawTank(hero.getX(), hero.getY(), g,hero.getDirect(),0);
        if(enemyTanks != null) {
            //这里会报错ConcurrentModificationException
            for (EnemyTank enemyTank : enemyTanks) {
                if(enemyTank.isLive){
                    drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),1);

                    for (Shot shot : enemyTank.shots) {
                        if (shot.isLive) {
                            g.draw3DRect(shot.getX(), shot.getY(), 1, 1, false);
                        } else {
                            //从Vector中移除子弹
                            enemyTank.shots.remove(shot);
                        }
                    }
                }
                else{
                    enemyTanks.remove(enemyTank);
                }
            }
        }
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
            //我
            case 0:
                g.setColor(Color.blue);
                break;
            //敌
            case 1:
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

    /**
     *
     * @param shot
     * @param enemyTank
     */
    public void hitTank(Shot shot,EnemyTank enemyTank) {
        switch (enemyTank.getDirect()){
            case 0:
            case 2:
                if(shot.getX()> enemyTank.getX() && shot.getX() < enemyTank.getX()+ 40
                        && shot.getY() > enemyTank.getY() && shot.getY() < enemyTank.getY() + 60)
                {
                    shot.isLive = false;
                    enemyTank.isLive = false;
                    booms.add(new Boom(enemyTank.getX(),enemyTank.getY()));
                }
                break;
            case 1:
            case 3:
                if(shot.getX() > enemyTank.getX() && shot.getX() < enemyTank.getX() + 60
                && shot.getY() > enemyTank.getY() && shot.getY() < enemyTank.getY() +40){
                    shot.isLive = false;
                    enemyTank.isLive = false;
                    booms.add(new Boom(enemyTank.getX(),enemyTank.getY()));
                }
                break;
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
            hero.shotGun();
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
            //判断是否击中敌人坦克
            for (Shot shot : hero.shots) {
                if(shot != null && shot.isLive){
                    for (EnemyTank enemyTank : enemyTanks) {
                        hitTank(shot,enemyTank);
                    }
                }
            }

            this.repaint();
        }
    }
}
