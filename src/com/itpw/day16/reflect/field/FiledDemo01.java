package com.itpw.day16.reflect.field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
(了解)
*/
public class FiledDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class studentClass = Class.forName("com.itpw.day16.reflect.bean.Student");

        Field[] declaredFields = studentClass.getDeclaredFields();
        for (Field field : declaredFields) {
            // 获取修饰符
            int modifyNum = field.getModifiers();
            String modify = Modifier.toString(modifyNum);

            // 获取属性类型
            Class<?> type = field.getType();
            String typeName = type.getSimpleName();

            // 获取变量名
            String fieldName = field.getName();

            System.out.println(modify+" "+typeName+" "+fieldName);


        }
    }
}

