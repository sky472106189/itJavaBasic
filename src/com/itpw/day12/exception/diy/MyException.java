package com.itpw.day12.exception.diy;

/*
    Java中怎样自定义异常？
        1、编写一个类继承Exception或RuntimeException
        2、提供一个无参构造，一个带String参的构造
*/
public class MyException extends Exception{
    public MyException(){
        super();
    }

    public MyException(String s){
        super(s);
    }
}
