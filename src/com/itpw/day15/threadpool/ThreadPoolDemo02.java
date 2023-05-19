package com.itpw.day15.threadpool;

import java.util.concurrent.*;

/*
    易错点:临时线程的创建实际是:核心线程无空闲，任务队列已满，此时再来一个任务时
*/
public class ThreadPoolDemo02 {
    public static void main(String[] args) {
    /*
        public ThreadPoolExecutor(
        int corePoolSize,                       最大核心线程数（正式员工最大数量）
        int maximumPoolSize,                    所有线程最大数量(正式员工 + 临时员工的最大数量)
        long keepAliveTime,                     临时线程最大的空闲时间
        TimeUnit unit,                          临时线程最大空闲时间的单位，TimeUnit枚举类型
        BlockingQueue<Runnable> workQueue,      任务队列。待处理任务数量>核心线程空闲数量，多余的任务存入该队列。如果队列满了，又有新的任务，就会创建临时线程。
        ThreadFactory threadFactory,            线程工厂。创建新线程的工厂。
        RejectedExecutionHandler handler        任务拒绝策略。拒绝条件：要执行的任务 > 所有线程最大数量（参数2） + 任务队列容量（参数5）
        ) {
     */

        // 1. 创建线程池对象
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,
                5,
                5,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        // 2. 提交任务
        Runnable r =
                () -> System.out.println("手动创建的线程池中的线程[" + Thread.currentThread().getName() + "]正在处理任务");

        // 新建11个线程，3个核心线处理后还剩8个，接着5个进任务队列，还剩3个，此时启动2个临时线程处理。还剩1个会被拒绝策略
        for (int i = 0; i < 11; i++) {
        /*
            线程池的submit和execute都可以用于向线程池提交任务，但是它们有一些细微的区别。
            submit方法会返回一个Future对象，可以通过这个对象来获取任务执行的结果，或者判断任务是否执行完成。而execute方法并不
            会返回任何结果，也无法判断任务是否执行完成。另外，当向线程池提交任务时，如果任务执行过程中抛出异常，submit方法会将
            异常包装在Future对象中返回，而execute方法并不会捕获异常，如果任务执行过程中发生异常，线程池中的线程将会立即终止。
            从功能上来说，submit方法更加灵活，可以更方便地对任务的执行结果进行控制和处理；而execute方法则更适合对于没有返回结
            果的无阻塞任务的处理。
        */
            pool.submit(r);
            // pool.execute(r);
        }

        // 3. 关闭线程池
        pool.shutdown();

    }
}
