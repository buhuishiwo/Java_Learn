package com._super;


public class Super1 {
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
        //super.getDetails()和getDetails()的区别
        //调用路径不同
        //super.getDetails()直接调用父类的方法
        //getDetails()会先在子类找有没有这个方法，如果没有再去父类找
        return super.getDetails()+" "+"Brand: " + brand;
    }
}

class NotePad extends Computer {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getNotePad() {
        return getDetails() + " " + "Color: " + color;
    }
}
