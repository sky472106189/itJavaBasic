package com.itpw.day16.annotation.demo1;

// 注解中有属性，那么必须赋值
@MyAnnotation(name="123")
@OtherAnnotation("123") // value属性名时可以直接省略名字
public class MyAnnotationDemo {
    public static void main(String[] args) {

    }
}
