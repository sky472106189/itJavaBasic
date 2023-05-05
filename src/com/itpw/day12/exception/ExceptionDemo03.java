package com.itpw.day12.exception;

public class ExceptionDemo03 {
    public static void main(String[] args) {
        /*
        程序执行到此发生了ArithmeticException异常，
        底层new了一个ArithmeticException异常对象
        然后抛出给了main方法,main方法没有处理
        将这个异常“自动”抛给了JVM，JVM最终终止
        程序的执行

        ArithmeticException继承RuntimeException，属于运行时异常，不需要预先处理
        但是仍会导致程序终止执行
        */
        System.out.println(100/0);
        System.out.println("HelloWorld!");
    }
}
