package com.haishili.tankgame;

import javax.swing.*;

public class TankGame01 extends JFrame {
    MyPanel mypanel = null;
    public static void main(String[] args) {
        TankGame01 tankGame01 = new TankGame01();
    }
    public TankGame01() {
        mypanel = new MyPanel();
        setTitle("Tank Game");
        add(mypanel);
        setSize(1000, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
