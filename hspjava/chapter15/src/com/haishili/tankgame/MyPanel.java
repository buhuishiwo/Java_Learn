package com.haishili.tankgame;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    Hero hero = null;
    public MyPanel() {
        hero = new Hero(100,100);
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,getWidth(),getHeight());
        drawTank(hero.getX(), hero.getY(), g,0,0);
        drawTank(hero.getX()+100, hero.getY(), g,0,1);
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
        switch (direct) {
            case 0://表示向上
                g.fill3DRect(x, y, 10,60,false);
                g.fill3DRect(x+30, y, 10,60,false);
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);
                g.drawLine(x+20,y,x+20,y+30);
                break;
            default:
                System.out.println("默认配置");
        }
    }
}
