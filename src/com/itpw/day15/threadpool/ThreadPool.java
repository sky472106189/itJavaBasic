package com.itpw.day15.threadpool;

import java.util.concurrent.*;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

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
            5、workQueue:指定线程池的阻塞队列
            6、threadFactory:指定线程池的线程工厂
            7、handler:指定线程池的任务拒绝策略(线程都在忙,任务队列也都满了时,新任务来了该如何处理)

    二、线程池，我们需要注意下面的两个问题
        Q：临时线程什么时候创建？
        A：新任务提交时，发现核心线程都在忙、阻塞队列满了、并且还可以创建临时线程，此时会创建临时线程。
        例如：饭店(线程池) - 厨子(线程) - 人多先排队(阻塞) - 队伍排满了 - 上临时厨师(创建最大线程数) - 今日可满(拒绝策略)

        Q：什么时候开始拒绝新的任务？
        A：核心线程和临时线程都在忙、任务队列也满了、新任务过来时才会开始拒绝任务。

    三、线程池核心属性标识
        // 是一个int类型的数值，表达两个意思，1:声明当前线程池的状态，2:声明线程池中的线程数
        // 高3位:线程池状态    低29位:线程池中线程个数
        private final AtomicInteger ctl = new AtomicInteger(ctlOf(RUNNING, 0));
        private static final int COUNT_BITS = Integer.SIZE - 3;  // Integer.SIZE - 3 = 29;方便后面位运算
        private static final int COUNT_MASK = (1 << COUNT_BITS) - 1;// 通过位运算得出最大容量(低29位,具体可以草稿手写)

        为什么不直接定义，而是用位移，是因为后面会用此值进行大小判断，所以线程池状态放在高3位才会更加决定32位具体有多大的。
        // 以-1左移29位解析:二进制补码表示为全1,然后左移29位,
        // (-1补码左移29位)1111,1111,1111,1111,1111,1111,1111,1111
        //                1110,0000,0000,0000,0000,0000,0000,0000
        // 所以111代表线程池为 RUNNING状 态
        private static final int RUNNING    = -1 << COUNT_BITS;
        // 000代表线程池为 SHUTDOWN 状态,不接受新任务,但是内部还会处理阻塞队列中的任务，正在进行的任务也正常处理
        private static final int SHUTDOWN   =  0 << COUNT_BITS;
        // 001代表线程池为 STOP 状态，不接受新任务,也不去处理阻塞队列中的任务,同时会中断正在执行的任务
        private static final int STOP       =  1 << COUNT_BITS;
        // 010代表线程池为 TIDYING 状态,过渡的状态,代表当前线程池即将GameOver
        private static final int TIDYING    =  2 << COUNT_BITS;
        // 011代表线程池为 TERMINATED 状态,会执行terminated(),且代表当前线程池已经GameOver
        private static final int TERMINATED =  3 << COUNT_BITS;

        // ~ 位运算取反
        private static int runStateOf(int c)     { return c & ~COUNT_MASK; }// 得到线程池的状态
        private static int workerCountOf(int c)  { return c & COUNT_MASK; }// 得到当前线程池的线程数量
*/
public class ThreadPool {
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
