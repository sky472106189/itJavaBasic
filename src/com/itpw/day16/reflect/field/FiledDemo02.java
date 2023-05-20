package com.itpw.day16.reflect.field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
(了解)
    反编译Field
*/
public class FiledDemo02 {
    public static void main(String[] args) throws ClassNotFoundException {
        StringBuilder sb = new StringBuilder();

        Class<?> unknownClass = Class.forName("java.lang.String");
        sb.append(Modifier.toString(unknownClass.getModifiers()) + " class " + unknownClass.getSimpleName()+"{\n");
        Field[] fields = unknownClass.getDeclaredFields();
        for (Field field : fields) {
            sb.append("\t");
            sb.append(Modifier.toString(field.getModifiers()));
            sb.append(" ");
            sb.append(field.getType().getSimpleName());
            sb.append(" ");
            sb.append(field.getName());
            sb.append(";\n");
        }
        sb.append("}");
        System.out.println(sb);
    }
}
