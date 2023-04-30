package com.ithmbasic.day02;


public class MathDemo {
    public static void main(String[] args) {

        int a = 10;//a=10
        int b = 20;//b=20
        int res = a+b;
        /*
        * 如果+有字符串参与，那就不是加法，是字符串拼接
        * 如果第一个就是字符串，那么后面的都会被当成字符串
        * */
        System.out.println("a+b= "+ (a+b));   // 输出：a+b=30;
        System.out.println(a+b+"a+b="+a+b);   // 输出：30a+b= 1020;

        /*
        * 多个整数参与运算，要想得到小数，其中一个必须变成浮点类型，这个和C一样
        * */
        int c = 10;
        int d = 20;
        double res2 = c/d;
        double res3 = c/(double)d;
        double res4 = c/20.0;
        System.out.println(res2);   //res2 = 0;
        System.out.println(res3);   //res2 = 0.5;
        System.out.println(res4);   //res2 = 0.5;

        /* 面试题:
        * 1.num1++ 执行完 num传的值是10
        *   此时是10+(--num1)+(num2++)+(num2*10)
        * 2.--num  此时num是1 但是自减在前 执行--num1 = 10 故传的是10
        *   此时是 10 + 10 + (num2++)+(num2*10)
        * 3.num2++ 此时传的是20;
        *   此时是10+10+20+(num2*10);
        * 4.num2*10 此时num2 = 21;
        *   此时是 10+10+20+210 = 250
        * */
        int num1 = 10;
        int num2 = 20;
        int sum = (num1++)+(--num1)+(num2++)+(num2*10);
        System.out.println(sum); //sum = 250

    }
}
