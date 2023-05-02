package com.itpw.day11.decimal;

import java.text.DecimalFormat;

/*
 * 关于数字的格式化(了解)
 * */
public class DecimalFormatDemo01 {
    public static void main(String[] args) {
        /*
         * 数字格式有哪些？
         *   # 任意数字
         *   , 千分位
         *   . 小数点
         *   0 不够补0
         * */

        // 有四舍五入
        DecimalFormat df = new DecimalFormat("###,###.##");
        String format = df.format(1234.567);
        System.out.println(format);// 1,234.57

        DecimalFormat df1 = new DecimalFormat("###,###.0000");
        String format1 = df1.format(1234.56);
        System.out.println(format1);// 123,4.5600

    }
}
