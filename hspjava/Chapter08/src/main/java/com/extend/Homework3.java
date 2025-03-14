package com.extend;

public class Homework3 {
    public static void main(String[] args) {
        PC pc = new PC();
        NotePad notePad = new NotePad();
        pc.setBrand("Xiaomi");
        notePad.setColor("Blue");
        System.out.println(pc.getPC());
        System.out.println(notePad.getNotePad());
    }
}

class Computer{
    private String CPU = "7000x3d";
    private String ram ="8GB";
    private String disk ="1TB";

    public String getDetails() {
        return "CPU: " + CPU + ", ram: " + ram + ", disk: " + disk;
    }
}

class PC extends Computer {
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getPC() {
        return getDetails()+" "+"Brand: " + brand;
    }
}

class NotePad extends Computer {
    private String color;
    public void setColor(String color) {
        this.color = color;
    }
    public String getNotePad() {
        return getDetails()+" "+"Color: " + color;
    }
}
