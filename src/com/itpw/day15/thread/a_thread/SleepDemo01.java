package com.itpw.day15.thread.a_thread;

/*
    关于线程的sleep方法:
        static void sleep(long millis)
        1、静态方法
        2、参数是毫秒
        3、作用：让当前线程进入休眠，既“阻塞状态”，放弃占有的CPU时间片，让给其他线程
        4、可以实现周期执行某方法
*/
public class SleepDemo01 {
    public static void main(String[] args) throws InterruptedException {

        // Thread.sleep(1000 * 3);
        // 3秒之后执行
        // System.out.println("Hello World");

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
            Thread.sleep(1000);
        }
    }
}
