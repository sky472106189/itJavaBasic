package com.itpw.day15.thread.c_死锁;
/*
    死锁产生的四个必要条件：
        1、互斥条件：一个资源每次只能被一个进程使用.
        2、请求与保持条件：一个进程因请求资源而阻塞时，对已获得的资源保持不放.
        3、不剥夺条件:进程已获得的资源，在末使用完之前，不能强行剥夺.
    　　4、循环等待条件:若干进程之间形成一种头尾相接的循环等待资源关系.

    o1和o2都是对象锁，各仅有一把，这是互斥条件
    t1不松手去拿另一个资源，t2也不松手去拿另一个资源，这是请求与保持条件
    synchronized锁，不执行完或者特殊方法中断，是不能被剥夺的，这是不剥夺条件
    t1等t2松手，t2也在等t1松手：这是循环等待条件
*/

public class DeadLock {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        MyThead1 t1 = new MyThead1(o1,o2);
        MyThead2 t2 = new MyThead2(o1,o2);

        /*
        t1先锁o1，延迟一会，然后t2锁o2.
        接着t1不松o1的锁，想拿o2；而t2不松o2的锁，想拿o1，形成死锁
        */
        t1.start();
        t2.start();
    }
}

class MyThead1 extends Thread{

    Object o1;
    Object o2;

    public MyThead1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        // 先拿到o1的锁,然后延迟一会拿o2锁（旨在让另一个线程先拿到o2锁）
        synchronized (o1){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 然后锁o2
            synchronized (o2){
            }
        }
    }
}

class MyThead2 extends Thread{

    Object o1;
    Object o2;

    public MyThead2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        // 先拿到o2的锁,然后延迟一会拿o1锁（旨在让另一个线程先拿到o1锁）
        synchronized (o2){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 然后锁o1
            synchronized (o1){
            }
        }
    }
}