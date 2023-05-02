package com.itpw.day11.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    Date另一个构造方法 Date(long date)
*/
public class DateDemo03 {
    public static void main(String[] args) {
        // 1970-01-01 00:00:00 001
        Date date = new Date(1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        // 北京时差 UTC+8 所以差8个小时
        // 1970-01-01 08:00:00 001
        System.out.println(sdf.format(date));

        // 获取昨天的此时间
        Date yesterday = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
        System.out.println(sdf.format(yesterday));// 2023-05-01 14:16:59 353
    }
}
