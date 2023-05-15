package com.itpw.day15.thread;

/*
* 如何提前终止线程执行
* 1、stop()方法，已过时，不推荐，强行杀死线程，极易导致数据丢失
* 2、用标志位去终止线层执行
* */
public class ThreadDemo05 {
    public static void main(String[] args) {
        MyRunnable3 mr = new MyRunnable3();
        Thread t = new Thread(mr);
        t.start();

        // 让t线程执行5秒就杀死它
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // t.stop(); // 不要用
        mr.flag = false;// 标记法
    }
}

class MyRunnable3 implements Runnable{

    // 布尔标记
    boolean flag = true;

    @Override
    public void run() {
            for (int i = 0; i < 10; i++) {
                if(flag){
                    System.out.println(Thread.currentThread().getName()+"-->"+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    // 终止当前线程
                    return;
                    // 不止于此，还可以在return前进行特殊操作，比如save某些数据等
                }
            }

    }
}
