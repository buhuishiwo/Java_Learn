package com.haishili.static_;

import com.sun.tools.javac.Main;

public class StaticMethod {

    public static void main(String[] args) {
        Student student = new Student();
        Student.payfee(300);
        Student.payfee(500);
        student.showAllFee();
        StaticMethod staticMethod = new StaticMethod();

    }

}
class Student {
    private static int fee = 0;
    public static void payfee(int money) {
        fee += money;
    }
    public void showAllFee() {
        System.out.println(fee);
    }
}
