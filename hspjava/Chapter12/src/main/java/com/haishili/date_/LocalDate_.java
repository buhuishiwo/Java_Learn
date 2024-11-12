package com.haishili.date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_ {
    public static void main(String[] args) {
        //年月日
        LocalDate now = LocalDate.now();
        System.out.println(now);
        //时分秒毫秒
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);
        //年月日时分秒毫秒
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDateTime);
        //定制时间格式
        //DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(nowDateTime.format(formatter));
        //提供 plus 和 minus 方法可以对当前时间进行加减
        System.out.println(nowDateTime.plusYears(3).format(formatter));
        System.out.println(nowDateTime.minusMonths(3).format(formatter));
    }
}
