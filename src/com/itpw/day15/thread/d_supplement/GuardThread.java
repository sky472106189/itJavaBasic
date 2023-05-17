package com.itpw.day15.thread.d_supplement;

import com.itpw.day02.对象和引用.复杂引用分析.T;

/*
    守护线程
    public final void setDaemon(boolean on)

    当一个进程中所有的普通线程结束时, 进程就会结束, 此时所有正在运行的守护线程都会被强制杀掉
    (但是因为java虚拟机停止需要一定时间, 可能就不会出现立马将守护线程杀掉)
    守护线程的作用如：后台记录操作日志、监控内存、垃圾回收等等......
*/
public class GuardThread {
    public static void main(String[] args) {
        Thread guard = new BackupThread();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+"-->"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.setName("t1");
        guard.setName("守护线程");

        // 启动线程前，将线程设置为守护线程
        guard.setDaemon(true);

        guard.start();
        for (int i = 1; i <= 5; i++) {
        System.out.println(Thread.currentThread().getName()+"-->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("main Over");

        System.out.println("t1 start");
        t1.start();


    }

}

class BackupThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        // 即使是死循环，但由于是守护者，当用户线程结束，守护线程自动终止
        while (true) {
            System.out.println(Thread.currentThread().getName() + "-->" + (++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
