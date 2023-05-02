package com.itpw.day11.decimal;

import java.math.BigDecimal;

/*
* BigDecimal 属于大数据，精度极高，引用数据类型。专门用于财务软件当中
* */
public class BigDecimalDemo01 {
    public static void main(String[] args) {
        BigDecimal v1 = new BigDecimal(100);
        BigDecimal v2 = new BigDecimal(200);

        // v1+v2; //v1和v1都是引用不能直接+求和
        BigDecimal res = v1.add(v2);
        System.out.println(res); //300

        BigDecimal divide = v1.divide(v2);
        System.out.println(divide);//0.5
    }
}
