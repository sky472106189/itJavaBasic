package com.itpw.day15.thread.b_线程安全.reentlock;

import java.util.concurrent.locks.ReentrantLock;

/*
    1、ReentrantLock 一个可重入且独占式的锁。比synchronized 更灵活、更强大，增加了轮询、超时、中断、公平锁和非公平锁等高级功能。

    2、 ReentrantLock 默认使用非公平锁，也可以通过构造器来显式的指定使用公平锁。
        // 传入一个 boolean 值，true 时为公平锁，false 时为非公平锁
        public ReentrantLock(boolean fair)

    3、JDK官方规范要求：
        ReentrantLock的使用要配合配合 try/finally 语句块来完成
            try{
                lock.lock;
            }finally{
                lock.unlock;
            }

    4、公平锁 : 锁被释放之后，先申请的线程先得到锁。性能较差一些，因为公平锁为了保证时间上的绝对顺序，上下文切换更频繁。
       非公平锁：锁被释放之后，后申请的线程可能会先获取到锁，是随机或者按照其他优先级排序的。性能更好，但可能会导致某些线程永远无法获取到锁。出现"饿死"

    5、ReentrantLock和synchronized的异同点
     相同点:都可以用来保证线程安全，两者都是可重入锁
     不同点:1.ReentrantLock支持公平锁和非公平锁。
           2.在低竞争情况下synchronized会更好，因为开销更小。高竞争情况下，由于ReentrantLock有更细粒度和高级功能，所以性能可能更好
           3.synchronized发生异常锁会释放,ReentrantLock不会，所以需要用finally代码块unlock
*/
public class Demo {
    public static void main(String[] args) {
        Account account = new Account("6085", 10000D);

        Thread t1 = new AccountThread(account);
        Thread t2 = new AccountThread(account);
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();

        ReentrantLock lock = account.getLock();

        // getHoldCount() 查询当前线程对此锁定的保持数。
        System.out.println(lock.getHoldCount());
        // isHeldByCurrentThread() 查询当前线程是否持有此锁定。
        System.out.println(lock.isHeldByCurrentThread());
        // isLocked() 查询此锁是否由任何线程持有
        System.out.println(lock.isLocked());
        // tryLock() 只有在调用时没有被另一个线程持有时才获取锁。 true表示成功 false表示获取失败
        if(lock.tryLock()){
            lock.unlock();
        }
    }
}

class AccountThread extends Thread {

    private Account account;

    public AccountThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.withDraw(5000);
        System.out.println(Thread.currentThread().getName() + "线程取款5000成功,余额:" + account.getBalance());
    }
}

