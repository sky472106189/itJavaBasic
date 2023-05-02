package com.itpw.day11.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java中对日期的处理
        String-->Date   SimpleDateFormat中的parse(String s)方法
        Date-->String   SimpleDateFormat中的format(格式);
*/
public class DateDemo01 {
    public static void main(String[] args) throws ParseException {
        // 获取系统当前时间
        Date nowTime = new Date();
        //System.out.println(nowTime.toString());// Tue May 02 13:51:28 CST 2023

        // 格式化日期
        // java.text包下，专门负责日期格式化
        /*
            yyyy    年
            MM      月
            dd      日
            HH      时
            mm      分
            ss      秒
            SSS     毫秒(毫秒3位，最高999，1000毫秒=1秒)
        */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        // 用format()方法实现日期格式化
        String format = sdf.format(nowTime);
        System.out.println(format);

        // 字符串形式的日期，怎么转换成Date？ 用parse()方法
        String time = "2008/08/08 08:08:08 999";
        // 格式要和字符串格式一致
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss SSS");
        Date parseTime = sdf1.parse(time);
        System.out.println(parseTime);// Fri Aug 08 08:08:08 CST 2008
    }
}
