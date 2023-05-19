package com.itpw.day15.thread.b_线程安全.reentlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 银行账户
 */
public class Account {
    private String actNo;
    private double balance;

    // 1.创建lock对象
    private final ReentrantLock lock = new ReentrantLock();

    public ReentrantLock getLock() {
        return lock;
    }

    public void withDraw(double money){
        // 2.上锁
        lock.lock();

        double before = this.getBalance();
        double after = before - money;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setBalance(after);

        // 3.解锁
        lock.unlock();
    }

    public Account(String actNo, double balance) {
        this.actNo = actNo;
        this.balance = balance;
    }

    public String getActNo() {
        return actNo;
    }

    public void setActNo(String actNo) {
        this.actNo = actNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
