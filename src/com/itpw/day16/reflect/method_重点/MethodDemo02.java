package com.itpw.day16.reflect.method_重点;

import java.lang.reflect.Method;

/*
    重点:通过反射机制调用方法

    未来形参都来自配置文件，灵活性提高
        Class.forName(来自配置文件);
        getDeclaredMethod(来自配置文件);
        invoke(来自配置文件);
*/
public class MethodDemo02 {
    public static void main(String[] args) throws Exception {
        Class<?> userServiceClass = Class.forName("com.itpw.day16.reflect.service.UserService");
        Object obj = userServiceClass.newInstance();
        // 获取方法 login
        // 获取方法不仅要方法名，还需要形参列表，因为java存在方法重载
        Method loginMethod = userServiceClass.getDeclaredMethod("login", String.class, String.class);
        // 调用方法 invoke(Object obj, Object... args) //第一个参数是对象，后面接形参列表
        Object flag = loginMethod.invoke(obj, "admmin", "123");
        System.out.println(flag);
    }
}
