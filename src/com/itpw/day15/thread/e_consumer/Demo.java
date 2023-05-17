package com.itpw.day15.thread.e_consumer;

import com.itpw.day02.对象和引用.复杂引用分析.T;

import java.util.ArrayList;
import java.util.List;

/*
1、使用wait方法和notify方法实现"生产者和消费者模式"
2、wait和notify方法不是线程对象的方法，是普通java对象都有的方法
3、wait和notify方法建立在线程同步的基础之上。因为多线程要同时操作一个仓库。有线程安全问题
4、wait方法作用:o.wait()让正在o对象上活动的线程t进入等待状态，并且释放掉t线程之前占有的o对象的锁。
5、notify方法作用:o.notify()让正在o对象上等待的线程唤醒，只是通知，不会释放o对象上之前占有的锁。
6、模拟：
    仓库我们用List集合
    List集合中假设只能存储1个元素
    1个元素就表示仓库满了
    如果List集合中元素个数是0,就表示仓库空了
    保证List集合中永远最多存储1个元素
    必须做到这种效果:生产1个,消费1个

    其实就是把锁看成mutex = 1;wait就是P(mutex);notify就是V(mutex);
*/
public class Demo {
    public static void main(String[] args) {
        List<Object> store = new ArrayList<>();
        Thread t1 = new Thread(new Producer(store),"生产者");
        Thread t2 = new Thread(new Consumer(store),"消费者");

        t1.start();
        t2.start();

    }
}

/**
 * 生产者
 */
class Producer implements Runnable {

    private List<Object> store;

    public Producer(List<Object> store) {
        this.store = store;
    }

    @Override
    public void run() {
        // 一直生产
        while (true) {
            synchronized (store) {
                // 如果仓库容量>0 那么就不能生产了,只能消费,
                // 所以store.wait()会把Producer持有的锁释放，并且让自己进入等待阻塞状态
                if (store.size() > 0) {
                    try {
                        store.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    // 如果仓库里面为空，那么就可以生产
                    Object o = new Object();
                    System.out.println("生产了"+o);
                    store.add(o);
                    // 先生产一个,然后notify(),只是通知，并不会释放锁
                    store.notify();
                    // 注意当代码再次执行到这，再往下走出{},这个锁就已经释放了，需要再次争抢，这个释放
                    // 是代码运行的结果，和notify无关
                }
            }
        }
    }
}

/**
 * 消费者
 */
class Consumer implements Runnable {

    private List<Object> store;

    public Consumer(List<Object> store) {
        this.store = store;
    }

    @Override
    public void run() {
        // 一直消费
        while (true) {
            synchronized (store) {
                // 如果仓库容量<=0 那么就不能消费了,只能生产,
                // 所以store.wait()会把Consumer持有的锁释放，并且让自己进入等待阻塞状态
                if (store.size() <= 0) {
                    try {
                        store.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    // 如果仓库里面有容量，那么就可以消费
                    Object o = store.get(0);
                    store.remove(0);
                    System.out.println("消费了" + o);
                    // 先消费一个,然后notify(),只是通知，并不会释放锁
                    store.notify();

                }
            }
        }
    }
}
