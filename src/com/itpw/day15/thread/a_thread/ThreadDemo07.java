package com.itpw.day15.thread.a_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
    实现线程的第三种方式:
        FutureTask方式,实现Callable接口.(JDK5新特性)
*/
public class ThreadDemo07 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                // call 相当于run 只是多一个返回值
                System.out.println("call 执行");
                Thread.sleep(1000);
                System.out.println("call 结束");
                int a = 5;
                int b = 20;
                return a+b;
            }
        });

        // 将FutureTask类放入Thread有参构造
        Thread t = new Thread(task);

        // 在此处get会一直卡死，等一个永远不会有的结果，因为线程t一直未start
        // Object o = task.get();

        t.start();

        // 执行FutureTask类的get方法获取返回结果
        // 此方法会导致主线程阻塞
        Object o = task.get();
        System.out.println(o);

        // 往后的执行要等待call方法的结束,因为get是同步等待，需要等待结果。
        System.out.println("hello world");
    }
}
