package com.itpw.day11.date.jdk8newfeature;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
* 格式化日期类（线程安全）
* */
public class DateTimeFormatterDemo01 {
    public static void main(String[] args) {
        // 1、创建一个日期格式化对象 (不是new)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 2、新建LocalDateTime获取时间
        LocalDateTime now = LocalDateTime.now();

        // 3.1、正向格式化 LocalDateTime -> String
        String f1 = formatter.format(now);
        System.out.println(f1);
        // 3.2、反向格式化 LocalDateTime -> String
        String f2 = now.format(formatter);
        System.out.println(f2);

        // 4、字符串 转为 LocalDateTime
        // String dateStr = "1900-1-1 11:11:11"; 报错
        String dateStr = "1900-01-01 11:11:11";
        LocalDateTime parse = LocalDateTime.parse(dateStr, formatter);
        System.out.println(parse);


    }
}
