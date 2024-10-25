package com.haishili.inner;

public class AnonyInnerExercise02 {
    public static void main(String[] args) {
        new CellPhone().alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        new Bell() {
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        }.ring();
    }
}

interface Bell {
    void ring();
}

class CellPhone{
    public void alarmclock(Bell bell){
        bell.ring();
    }
}
