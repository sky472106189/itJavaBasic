package com.itpw.day12.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
   1、Throwable下有两个分支:1、Error(不可处理，直接退出JVM) 2、Exception(可处理)
       Exception下有两个分支:
           Exception直接子类:编译时异常，通常发生概率较高
           RuntimeException:运行时异常，通常发生概率较低

   2、易混点:编译时异常和运行时异常，都是发生在运行阶段。编译阶段异常是不会发生的。因为只有程序运行时
   才可以new对象，异常的发生就是new异常对象

   3.1、那编译时异常因为什么而得名？
        答：因为编译时异常必须在编译(编写)阶段预先处理(try-catch/throws)，如果不处理编译器报错。如：
   new SimpleDateFormat.parse()方法必须处理，否则代码不通过。
   3.2、运行时异常因为什么得名？
        答：运行时异常：一般是程序员业务没有考虑好或者是编程逻辑不严谨引起的程序错误，自己的水平有问题!编译
   阶段不报错,运行可能报错。如除0，空指针异常，类型转换异常。

   4、Java语言对于异常的处理有两种方式
        4.1、方法声明位置上，使用throws关键字，抛给上一级
        4.2、使用try-catch语句进行异常捕捉

        举个例子：
            我是某集团的员工，因为我的失误，导致公司损失了1000块
            “损失1000块”可以看做一个异常的发生，此时有两种处理方式
            一、我把这件事告诉我的领导（异常上抛）
            二、我自己掏腰包把这个钱补上（异常捕捉）
    5、注意：java异常发生如果一直上抛，抛给main方法后，main方法继续上抛给调用者JVM
    JVM知道这个异常的发生，只有一个结果，终止java程序的执行

*/
public class ExceptionDemo02 {
    public static void main(String[] args) throws ParseException {
        /*
        * 关于编译时异常和运行时异常是否会影响后续代码执行的演示
        * */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date parse = sdf.parse("2023-11-11");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("使用try-catch，发生Exception的异常是会执行此行的");

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse1 = sdf1.parse("2023-11-11");
        System.out.println("直接throws的话，发生Exception的异常不会执行此行");

        // Object s = null;
        // if(s.equals(null));
        // System.out.println("发生RunTimeException不会执行此行");

    }
}
