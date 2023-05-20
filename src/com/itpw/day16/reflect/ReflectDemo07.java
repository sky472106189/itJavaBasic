package com.itpw.day16.reflect;

/*
    获取该类的父类和接口类
*/
public class ReflectDemo07 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> string = Class.forName("java.lang.management.PlatformManagedObject");
        // 获取父类(java除了接口都是单继承)
        Class<?> superclass = string.getSuperclass();
        System.out.println(superclass.getName());
        // 获取实现的接口集合
        Class<?>[] interfaces = string.getInterfaces();
        for (Class<?> in:interfaces){
            System.out.println(in.getSimpleName());
        }
    }
}
