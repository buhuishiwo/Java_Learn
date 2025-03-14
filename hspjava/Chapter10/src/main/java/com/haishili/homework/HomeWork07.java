package com.haishili.homework;

public class HomeWork07 {
    public static void main(String[] args) {
        Color.RED.show();
    }
}
interface IA {
    void show();
}
enum Color implements IA {
    RED(255,0,0),
    BLACK(0,0,0),
    BLUE(0,0,255),
    GREEN(0,255,0),
    YELLOW(255,255,0);
    private int redValue;
    private int blueValue;
    private int greenValue;

    Color(int redValue, int blueValue, int greenValue) {
        this.redValue = redValue;
        this.blueValue = blueValue;
        this.greenValue = greenValue;
    }

    @Override
    public void show() {
        System.out.println("属性值为："+redValue+" "+blueValue+" "+ greenValue);
    }
}
