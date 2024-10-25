//package com.haishili.enum_;
//
//public class Enumeration02 {
//    public static void main(String[] args) {
//        System.out.println(Season.AUTUMN.getEpisode());
//    }
//}
//
////自定义枚举类
////构造器私有化，只提供 get 方法，对外暴露对象，本类内部创建一组对象
//class Season {
//    private String season;
//    private String episode;
//
//    //定义了四个对象
//    public final static Season SPRING = new Season("夏天","温暖");
//    public final static Season WINTER = new Season("冬天","寒冷");
//    public final static Season AUTUMN = new Season("秋天","凉爽");
//    public final static Season SUMMER = new Season("夏天","炎热");
//    private Season(String season, String episode) {
//        this.season = season;
//        this.episode = episode;
//    }
//    public String getSeason() {
//        return season;
//    }
//    public String getEpisode() {
//        return episode;
//    }
//}
