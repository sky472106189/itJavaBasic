package com.itpw.day16.annotation.demo3;

import java.lang.reflect.Method;

/*
    通过反射获取注解值
        注意必须是@Retention(RetentionPolicy.RUNTIME)才行
*/
public class ReflectAnnotationDemo {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("com.itpw.day16.annotation.demo3.MyAnnotationDemo");
        Method func1 = c.getMethod("func1");
        // 判断是否有该注解
        if(func1.isAnnotationPresent(MyAnnotation.class)){
            // 获取注解值
            MyAnnotation annotation = func1.getAnnotation(MyAnnotation.class);
            String value = annotation.value();
            System.out.println(value);
        }


    }
}
