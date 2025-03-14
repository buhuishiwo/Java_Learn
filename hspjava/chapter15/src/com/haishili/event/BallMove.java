package com.haishili.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame {
    Mypanel mypanel = null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }
    public BallMove() {
        mypanel = new Mypanel();
        add(mypanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(mypanel);
        setSize(400, 300);
        setVisible(true);
    }
}

//KeyListener是键盘监听器，可以监听键盘事件
class Mypanel extends JPanel implements KeyListener {
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);

    }

    //有字符输出时，该方法就会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //当某个键按下。该方法会触发
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        //向下移动
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y++;
        }else if (e.getKeyCode() == KeyEvent.VK_UP) {
            y--;
            if(y<=0){
                y=0;
            }
        }else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x--;
            if(x<=0){
                x=0;
            }

        }
        else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x++;
        }
        //重绘小球
        repaint();
    }
    //松开某键会触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
