package com.itpw.day16.annotation.demo1;

// 自定义注解
public @interface MyAnnotation {

    // 注解中可以有属性，但是使用后必须赋值
    String name();

    // 指定default后，不赋值就是默认值
    int age() default 25;
}
