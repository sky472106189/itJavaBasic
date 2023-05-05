package com.itpw.day12.exception;

/*
    1、获取异常简单的描述信息：
        String msg = exception.getMessage();
    2、打印异常追踪的堆栈信息（红字）
        exception.printStackTrace();
*/
public class ExceptionDemo07 {
    public static void main(String[] args) {
        NullPointerException e = new NullPointerException("空指针异常");
        // 空指针异常
        System.out.println(e.getMessage());
        // 输出一堆红字
        /*
        java.lang.NullPointerException: 空指针异常
	        at com.itpw.day12.exception.ExceptionDemo07.main(ExceptionDemo07.java:11)
        */
        e.printStackTrace();
        System.out.println("HelloWorld");

        /*
          补充:后台有一个线程，一个负责打印异常信息，一个负责输出HelloWorld
        */
    }
}
