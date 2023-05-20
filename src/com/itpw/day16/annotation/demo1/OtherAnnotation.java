package com.itpw.day16.annotation.demo1;


public @interface OtherAnnotation {
    // 属性唯一，属性名为value时会比较特殊，其在赋值时可以省略属性名
    String value();

    // 指定default后，不赋值就是默认值
    int age() default 25;
}
