package com.itpw.day16.annotation.demo2;

public @interface MyAnnotation {
    /*
        注解中的属性可以是：
            byte,short,char,int,long,float,double,boolean,char,String,Class,枚举,以及对应的数组
        注意:不能是包装类和自定义类
    */

    int age();

    String[] emails();
}
