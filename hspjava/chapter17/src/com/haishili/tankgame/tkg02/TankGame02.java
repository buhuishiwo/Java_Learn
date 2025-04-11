package com.haishili.tankgame.tkg02;

import javax.swing.*;


public class TankGame02 extends JFrame {
    MyPanel mypanel = null;
    public static void main(String[] args) {
        TankGame02 tankGame02 = new TankGame02();
    }
    public TankGame02() {
        mypanel = new MyPanel();
        setTitle("Tank Game");
        add(mypanel);
        new Thread(mypanel).start();
        //添加监听器到面板
        addKeyListener(mypanel);
        setSize(1000, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
