package com.haishili.enum_;

public class EnumExercise01 {
    public static void main(String[] args) {
        System.out.println("===所有星期的信息如下===");
        for (Week week : Week.values()) {
            System.out.println(week.getName());
        }
    }
}
enum Week {

    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期天");

    private String name;
    private Week(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
