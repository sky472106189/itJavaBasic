package com.itpw.day15.thread.a_thread;

/*
* 线程的第二种方法 实现Runnable接口
*   更常用，因为java支持多实现，不支持多继承（接口除外）
* */
public class ThreadDemo02 {
    public static void main(String[] args) {
        // 编译报错。没有此方法，因为MyRunnable仅实现了Runnable接口
        // 而此接口仅一个方法，且没有父类
        // MyRunnable my = new MyRunnable();
        // my.start;

        // 使用Thread类来生成
        Thread t = new Thread(new MyRunnable());
        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main线程-->"+i);
        }

        // 使用Lambda完成
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+"使用lambda方式"+i);
            }
        });
        t2.start();
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("分支线程-->"+i);
        }
    }
}
