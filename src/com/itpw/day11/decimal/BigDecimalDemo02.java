package com.itpw.day11.decimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
* BigDecimal的一个经典且隐蔽的错误
*   总结:不要用new BigDecimal(浮点数)的格式创造。容易出错
* */
public class BigDecimalDemo02 {
    public static void main(String[] args) {
        // 错误的创建BigDecimal
        BigDecimal b1 = new BigDecimal(0.1);
        BigDecimal b2 = new BigDecimal(0.2);
        System.out.println(b1.add(b2));// 0.3000000000000000166533453693773481063544750213623046875

        // 传入字符串 无误
        BigDecimal b3 = new BigDecimal("0.1");
        BigDecimal b4 = new BigDecimal("0.2");
        System.out.println(b3.add(b4));// 0.3

        // 使用valueOf 无误
        BigDecimal b5 = BigDecimal.valueOf(0.1);
        BigDecimal b6 = BigDecimal.valueOf(0.2);
        System.out.println(b5.add(b6));// 0.3

        // 报错 算术异常
        BigDecimal d1 = BigDecimal.valueOf(1);
        BigDecimal d2 = BigDecimal.valueOf(3);
        // System.out.println(d1.divide(d2));
        System.out.println(d1.divide(d2, RoundingMode.HALF_UP));// 0 (四舍五入)
        System.out.println(d1.divide(d2, RoundingMode.CEILING));// 1 (向上取整)
        System.out.println(d1.divide(d2, RoundingMode.FLOOR));// 0 (向下取整)
        // 精确两位
        System.out.println(d1.divide(d2,2, RoundingMode.HALF_UP));// 0 (向下取整)

    }
}
