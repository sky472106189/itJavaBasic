package com.itpw.day12.exception.diy;

public class MyExceptionDemo01 {
    public static void main(String[] args) {
        MyException e = new MyException("用户名不能为空!");
        e.printStackTrace();
    }
}
