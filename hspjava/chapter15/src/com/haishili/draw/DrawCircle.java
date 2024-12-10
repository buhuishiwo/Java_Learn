package com.haishili.draw;

import javax.swing.*;
import java.awt.*;

//如何在面板上画出圆形
public class DrawCircle  extends JFrame{
    private MyPanel panel = null;
    public static void main(String[] args) {
        new DrawCircle();
    }
    public DrawCircle() {
        //初始化面板
        panel = new MyPanel();
        //把面板放入窗口
        this.add(panel);
        //设置窗口的大小
        this.setSize(400,300);
        //关闭窗口时退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}


//1.先定义一个 MyPanel() ，继承 JPanel 类
class MyPanel extends JPanel {
    public void paint(Graphics g) {
        super.paint(g);//调用父类方法初始化
//        g.drawOval(50, 50, 100, 100);
//        g.drawLine(100, 50, 100, 100);
//        g.drawRect(10,10,100,100);
        g.setColor(Color.BLUE);
//        g.fillRect(10,10,100,100);
//        g.fill3DRect(10,20,100,200,true);
//        g.fillOval(50,50,100,100);
        Image image = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bg.png"));
        //g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
        g.setFont(new Font( "", Font.BOLD, 20));
        g.drawString("你好世界", 50, 50);
    }

}