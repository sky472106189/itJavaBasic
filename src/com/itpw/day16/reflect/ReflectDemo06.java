package com.itpw.day16.reflect;

import java.lang.reflect.Field;

/*
（掌握）
    通过反射获取对象的属性

    看似获取属性和修改属性变得麻烦了，但其实更加灵活，对所有类的属性都能如此操作
    具有模板性，
*/
public class ReflectDemo06 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class<?> studentClass = Class.forName("com.itpw.day16.reflect.bean.Student");

        Object obj = studentClass.newInstance();// obj就是Student对象，调用了无参构造
        Field noField = studentClass.getDeclaredField("no");
        // 获取属性(get)
            //获取obj对象的no属性值
        System.out.println(noField.get(obj));
        // 属性赋值(set)
            // 对obj对象的no属性值赋值
        noField.set(obj,2222);

        // 无法直接访问私有属性
        Field nameField = studentClass.getDeclaredField("name");
        // System.out.println(nameField.get(obj));
        // 打破封装 (体现了反射的缺点:打破封装，程序的安全性降低)
        nameField.setAccessible(true);
        noField.set(obj,"jackson");
        System.out.println(nameField.get(obj));
    }
}
