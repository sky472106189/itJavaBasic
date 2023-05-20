package com.itpw.day16.reflect.method_重点;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
(了解)
    反射Method
*/
public class MethodDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> userServiceClass = Class.forName("com.itpw.day16.reflect.service.UserService");
        // 获取所有方法
        Method[] methods = userServiceClass.getDeclaredMethods();

        for (Method method : methods) {
            // 获取修饰符列表
            System.out.println(Modifier.toString(method.getModifiers()));
            // 返回值类型
            System.out.println(method.getReturnType().getName());
            // 获取方法名
            System.out.println(method.getName());
            // 获取形参
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println(parameterType.getSimpleName());
            }
        }
    }
}
