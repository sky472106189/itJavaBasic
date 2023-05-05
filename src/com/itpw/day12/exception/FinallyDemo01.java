package com.itpw.day12.exception;
/*
    1、try-catch中的finally字句中:
        1.1、finally的代码是最后执行，且一定会执行的
        1.2、但是System.exit(0)时，finally不会执行
            System.exit(0);是退出JVM
*/
public class FinallyDemo01 {

    public static void main(String[] args) {
        int i = doSome();
        System.out.println(i);
    }

    public static int doSome(){
        try{
            int i = 1;
            System.exit(0);// 退出JVM
            return i;
        }catch (Exception e){
            e.printStackTrace();
            return 2;
        }finally {
            System.out.println("123444");
        }
    }
}
