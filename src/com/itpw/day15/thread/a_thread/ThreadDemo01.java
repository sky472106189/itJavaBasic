package com.itpw.day15.thread.a_thread;

/*
* 线程的第一种实现方式，继承Thread类
* */
public class ThreadDemo01 {
    public static void main(String[] args) {
        // main方法中调用分支线程
        MyThread t = new MyThread();
        // 这是错误的，并没有开启线程，而是仍在main方法栈帧中
        // t.run();
        // 正确的线程启动,start():启动分支线程，在JVM开辟一个新的方法栈。并且自动在分支栈中调用run方法
        // .start()方法启动瞬间就结束了，就启动了分支线程，接下来就会执行main的下一行或者分支线程中run方法了
        // 线程是抢占式的
        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("main线程-->"+i);
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程执行-->"+i);
        }
    }
}
