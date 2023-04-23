package com.ithm.day02;

/**
 * &&和& 最大的好处在&&只要第一个不满足，后续的都不会执行，增快了程序执行速度
 * & 是无论第一个满足不满足，都要执行到底
 * */
public class LogicDemo {
    public static void main(String[] args) {
        int x = 15;
        int y = 20;
        //短路与&& 短路或||
        /*
        短路与&&，要两个都真才返回真
        但是,只要第一个不为真,那么后面的就不会执行,这是与&的最大区别 */
        boolean flag1 = (x++>y && x++>10);
        System.out.println("&&的结果是");
        System.out.println(flag1);  //false
        System.out.println(x);      //16
         /*
        短路或||，有一个真就返回真 */
        x = 15;
        y = 20;
        boolean flag2 = (x++ >y || x++ >10);
        System.out.println("||的结果");
        System.out.println(flag2);  //true
        System.out.println(x);      //17

        //&  |
        //注意&和|的用法和短路与&&和短路或||一样，但是有一些细节。这个细节往往是面试点
        /*
        &和&&有区别，在于第一个为假，后一条语句还执行否
        &是执行    &&是不执行*/
        x = 15;
        y = 20;
        boolean flag3 = (x++>y & x++>10);
        System.out.println("&的结果");
        System.out.println(flag3);  //false
        System.out.println(x);      //17
        /*
        |和||没有本质区别，基本一样。*/
        x = 15;
        y = 20;
        boolean flag4 = (x++ >y | x++ >10);
        System.out.println("|的结果");
        System.out.println(flag4);  //true
        System.out.println(x);      //17

        //异或^  同0异1,偶尔某些底层算法会用到
        System.out.println("异或");
        System.out.println(true^true);  //false
        System.out.println(1^1);        //0
        System.out.println(2^3);        //1
    }
}
