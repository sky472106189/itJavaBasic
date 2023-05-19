package com.itpw.day15.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    线程池会将放入的线程自动启动
*/
public class ThreadPoolDemo01 {
    public static void main(String[] args) {

        simple();

        // static ExecutorService newFixedThreadPool(int nThreads) 创建一个指定最多线程数量的线程池
        newCached();

        // static ExecutorService newCachedThreadPool() 创建一个默认的线程池，容量为int最大值
        newFixedPool();
    }

    public static void newCached(){
        // 1. 创建线程池对象
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);
        // 2. 创建任务所属的资源对象
        Runnable r = () -> System.out.println(Thread.currentThread().getName() + "正在执行");
        for (int i = 0; i < 1000; i++) {
            // 3. 提交任务
            newFixedThreadPool.execute(r);
        }
        // 4.关闭(不推荐，一般不关闭)
        newFixedThreadPool.shutdown();

    }

    public static void newFixedPool() {
        Runnable r = () -> System.out.println(Thread.currentThread().getName() + "正在执行");
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 1000; i++) {
            newCachedThreadPool.execute(r);
        }
        newCachedThreadPool.shutdown();
    }

    // 最简单的使用
    public static void simple() {
        // 创建线程池对象
        ExecutorService pool = Executors.newCachedThreadPool();
        // 提交任务到线程池
        pool.submit(() -> System.out.println("线程池中的线程[" + Thread.currentThread().getName() + "]执行任务代码中……"));
        // 关闭线程池
        pool.shutdown();
    }
}
