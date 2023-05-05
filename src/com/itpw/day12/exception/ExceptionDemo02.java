package com.itpw.day12.exception;

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
    public static void main(String[] args){

    }
}
