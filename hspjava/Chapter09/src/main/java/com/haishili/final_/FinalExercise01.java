package com.haishili.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(2,3.14);
        circle.getS();
    }
}

class Circle {
    private double redius;
//    private final double PI = 3.14;
    private final double PI;

//    public Circle(double redius) {
//        this.redius = redius;
//    }

    public Circle(double redius, double PI) {
        this.redius = redius;
        this.PI = PI;
    }

    public void getS() {
        System.out.println("S = "+(redius*PI*PI));
    }
}
