package com.haishili.homework;

public class HomeWork01 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        System.out.println(frock.getSerialNumber());
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
    }
}

class Frock {
    private static int currentNum = 100000;

    private int serialNumber;

    public static int getNextNum() {
        currentNum = currentNum + 100;
        return currentNum;
    }

    public Frock() {
        this.serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }




}
