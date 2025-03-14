//package com.haishili.enum_;
//
//public class Enumeration01 {
//    public static void main(String[] args) {
//        Season season = new Season("夏天","温暖");
//        Season season1 = new Season("夏天","炎热");
//        Season season2 = new Season("秋天","凉爽");
//        Season season3 = new Season("冬天","寒冷");
//        //对于季节来说，只有固定的四个且不会增加
//        //使用类来定义季节并不合理，引出了枚举类，讲具体对象一个一个列举出来的类
//    }
//}
//
//class Season {
//    private String name;
//    private String description;
//    public Season(String name, String description) {
//        this.name = name;
//        this.description = description;
//    }
//    public String getName() {
//        return name;
//    }
//    public String getDescription() {
//        return description;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setDescription(String description) {
//        this.description = description;
//    }
//}
