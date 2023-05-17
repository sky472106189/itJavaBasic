package com.itpw.day15.thread.a_thread;

/*
    Sleep方法的面试题
*/
public class SleepInterview {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread3();
        t.setName("t");
        t.start();

        // 问题:此sleep方法会让线程t进入休眠吗
        // 回答:不会,线程的睡眠只针对当前线程,因为sleep是一个静态方法
        // 最终执行的还是Thread.sleep(1000 * 5)
        t.sleep(1000 * 5);
        System.out.println("Hello World!");
    }
}

class MyThread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
