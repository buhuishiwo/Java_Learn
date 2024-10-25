package com.haishili.enum_;

public class Enumeration03 {
}

//使用 enum 关键字
enum Season2 {
    SPRING("春天","温暖");


    private String name;
    private String desc;

    Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return desc;
    }
}
