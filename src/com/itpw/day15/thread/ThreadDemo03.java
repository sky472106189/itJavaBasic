package com.itpw.day15.thread;

/*
* Runnable的匿名内部类
* */
public class ThreadDemo03 {
    public static void main(String[] args) {
        // 匿名内部类+lambda表达式
        Thread t = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                System.out.println("分支线程"+i);
            }
        });
        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("main线程-->"+i);
        }
    }
}
