package com.itpw.day15.threadpool;

import java.util.concurrent.*;

/*
    一、如何创建一个线程池对象？
        public ThreadPoolExecutor(int corePoolSize,
                              int maximumPoolSize,
                              long keepAliveTime,
                              TimeUnit unit,
                              BlockingQueue<Runnable> workQueue,
                              ThreadFactory threadFactory,
                              RejectedExecutionHandler handler)
        形参解释:
            1、corePoolSize:指定线程池的核心线程的数量
            2、maximumPoolSize:指定线程池的最大线程数量
            3、keepAliveTime:指定临时线程的存活时间
            4、unit:指定keepAliveTime的时间单位(秒，分，时，天)
            5、workQueue:指定线程池的任务队列
            6、threadFactory:指定线程池的线程工厂
            7、handler:指定线程池的任务拒绝策略(线程都在忙,任务队列也都满了时,新任务来了该如何处理)

    二、线程池，我们需要注意下面的两个问题
        Q：临时线程什么时候创建？
        A：新任务提交时，发现核心线程都在忙、任务队列满了、并且还可以创建临时线程，此时会创建临时线程。

        Q：什么时候开始拒绝新的任务？
        A：核心线程和临时线程都在忙、任务队列也满了、新任务过来时才会开始拒绝任务。
*/
public class ThreadPoolDemo01 {
    public static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor(
                3,    // 核心线程数有3个
                5,  // 最大线程数有5个。   临时线程数=最大线程数-核心线程数=5-3=2
                8,    // 临时线程存活的时间8秒。 意思是临时线程8秒没有任务执行，就会被销毁掉。
                TimeUnit.SECONDS,// 时间单位（秒）
                new ArrayBlockingQueue<>(4), // 任务阻塞队列，没有来得及执行的任务在，任务队列中等待
                Executors.defaultThreadFactory(), // 用于创建线程的工厂对象
                new ThreadPoolExecutor.CallerRunsPolicy() // 拒绝策略
        );


    }
}
