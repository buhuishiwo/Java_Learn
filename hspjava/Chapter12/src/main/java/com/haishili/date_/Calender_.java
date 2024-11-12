package com.haishili.date_;

import java.util.Calendar;

public class Calender_ {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //获得当前年
        System.out.println(calendar.get(Calendar.YEAR));
        //获得月
        System.out.println(calendar.get(Calendar.MONTH));
        //获得这个月的第几天
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        //获得几点24进制
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        //获得几分
        System.out.println(calendar.get(Calendar.MINUTE));
        //获得几秒
        System.out.println(calendar.get(Calendar.SECOND));
        //获得毫秒
        System.out.println(calendar.get(Calendar.MILLISECOND));

    }
}
