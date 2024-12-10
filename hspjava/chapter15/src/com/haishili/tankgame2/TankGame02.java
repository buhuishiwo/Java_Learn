package com.haishili.tankgame2;

import javax.swing.*;

public class TankGame02 extends JFrame {
    MyPanel mypanel = null;
    public static void main(String[] args) {
        TankGame02 tankGame01 = new TankGame02();
    }
    public TankGame02() {
        mypanel = new MyPanel();
        setTitle("Tank Game");
        add(mypanel);
        //添加监听器到面板
        addKeyListener(mypanel);
        setSize(1000, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
