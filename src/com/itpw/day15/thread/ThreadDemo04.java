package com.itpw.day15.thread;

/*
    Thread部分API
    1、String getName() :获取线程名字
    2、void setName(String name) :修改线程对象名
    3、static Thread currentThread() :获取当前线程对象
*/
public class ThreadDemo04 {
    public static void main(String[] args) {
        // 两个线程
       Thread t1 = new MyThread2();
       Thread t2 = new MyThread2();

        // getName()获取线程名
        System.out.println(t1.getName()); // Thread-0
        System.out.println(t2.getName()); // Thread-1

        // setName(String s) 修改线程名
        // t1.setName("分支线程");

        // currentThread()方法出现在main方法中，所以当前线程是主线程
        // Thread main = Thread.currentThread();
        // System.out.println(main.getName()); // main

        t1.start();
        t2.start();
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
