package com.itpw.day15.thread.a_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
    实现线程的第三种方式:
        FutureTask方式,实现Callable接口.(JDK5新特性)

    注意:get()方法是FutureTask类的，不是Thread类的
*/
public class ThreadDemo07 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<String> task = new FutureTask<>(new MyCallable());

        // 将FutureTask类放入Thread有参构造
        Thread t = new Thread(task);

        // 在此处get会一直卡死，等一个永远不会有的结果，因为线程t一直未start
        // String o = task.get();

        t.start();

        // 执行FutureTask类的get方法获取返回结果
        // 此方法使用不当会导致主线程阻塞
        String o = task.get();
        System.out.println(o);

        // 这行的执行要等待call方法的结束,因为get是同步等待，需要等待结果。
        System.out.println("hello world");
    }
}

class MyCallable implements Callable<String>{
    @Override
    public String call() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
        return "done";
    }
}