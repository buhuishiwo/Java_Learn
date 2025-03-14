package com.haishili.date_;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime());//获得时间戳

        //格式化时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println(sdf.format(date));
    }
}
