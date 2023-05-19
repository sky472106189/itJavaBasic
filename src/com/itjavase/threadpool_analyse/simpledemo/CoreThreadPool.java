package com.itjavase.threadpool_analyse.simpledemo;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/*
这里先参考ThreadPoolExecutor的实现并且进行简化，实现一个只有核心线程的线程池，要求如下：
    - 暂时不考虑任务执行异常情况下的处理。
    - 任务队列为无界队列。
    - 线程池容量固定为核心线程数量。
    - 暂时不考虑拒绝策略。
*/

public class CoreThreadPool implements Executor {

    // 实例变量
    private BlockingQueue<Runnable> workQueue;
    private static final AtomicInteger COUNTER = new AtomicInteger();
    private int coreSize;
    private int threadCount = 0;

    // 有参构造初始化核心线程数 和 任务队列
    public CoreThreadPool(int coreSize) {
        this.coreSize = coreSize;
        this.workQueue = new LinkedBlockingQueue<>();
    }

    @Override
    public void execute(Runnable command) {
        // threadCount++后<=coreSize
        if (++threadCount <= coreSize) {
            // 执行到此，说明核心线程有余，直接让其工作
            new Worker(command).start();
        } else {
            try {
                // 核心线程不足,任务进队列等待
                workQueue.put(command);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    // 实例内部类
    private class Worker extends Thread {
        // 线程任务 成员变量
        private Runnable firstTask;

        // 线程命名并新建
        public Worker(Runnable runnable) {
            super("Worker-" + COUNTER.getAndIncrement());
            this.firstTask = runnable;
        }

        @Override
        public void run() {
            Runnable task = this.firstTask;
            while (null != task || null != (task = getTask())) {
                try {
                    task.run();
                } finally {
                    task = null;
                }
            }
        }
    }

    private Runnable getTask() {
        try {
            return workQueue.take();
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void main(String[] args) throws Exception {
        // 新建核心线程数为5的线程池
        CoreThreadPool pool = new CoreThreadPool(5);
        // 从0->9依次启动10个线程进入线程池
        IntStream.range(0, 10)
                .forEach(i -> pool.execute(() ->
                        System.out.println(String.format("Thread:%s,value:%d", Thread.currentThread().getName(), i))));
        // 主线程睡眠,防止线程池提前关闭
        Thread.sleep(Integer.MAX_VALUE);
    }
}
