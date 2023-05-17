package com.itpw.day15.thread.a_thread;

/*
    java的线程调度模型是抢占式调度（基于优先级），除此之外还有一种是均分式调度(平均时间片)
    java中和线程调度相关的方法
        void setPriority(int newPriority)   设置线程的优先级
        int getPriority()   获取线程的优先级
        最低优先级:1 默认优先级:5 最高优先级:5

        static void yield() 让位方法
        从运行态转诶就绪太，让出CPU时间片。注意，让位后仍有机会继续拿到CPU执行权

        void join() 合并线程
        class MyThread1 extends Thread{
            public void doSome(){
                MyThread2 t = new MyThread2();
                t.join;// 当前线程阻塞，t线程执行，直到t执行结束，当前线程才可以继续执行
            }
        }
*/
public class ThreadDemo06 {
    public static void main(String[] args) {

        System.out.println("main begin");

        Thread t = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+"-->"+i);
            }
        });

        t.start();

        try {
            // 合并线程，当前线程(main)阻塞，t线程执行，之后才轮到当前线程
            // 栈并未合并，只是让栈有了顺序
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main over");

    }
}
