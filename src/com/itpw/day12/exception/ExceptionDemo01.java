package com.itpw.day12.exception;

/*
    异常在java中以类的形式存在，每一个异常类都可以创建异常对象
*/
public class ExceptionDemo01 {
    public static void main(String[] args) {
        // 通常异常类创建异常对象
        NumberFormatException nfe = new NumberFormatException("数字格式化异常");
        System.out.println(nfe);// java.lang.NumberFormatException: 数字格式化异常

        int a = 10;
        int b = 0;
        // JVM执行到此处时,会new异常对象:new ArithmeticException("/ by zero")
        int c = a / b;


    }
}
