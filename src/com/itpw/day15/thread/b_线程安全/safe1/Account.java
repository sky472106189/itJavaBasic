package com.itpw.day15.thread.b_线程安全.safe1;

public class Account {
    private String actNo;
    private double balance;

    Object obj = new Object();

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

    // 在实例方法使用synchronized
    // 缺点：synchronized出现在这，锁的一定是this，不够灵活。且整个方法体都被锁住了，
    // 扩大了同步范围，导致效率较低
    // 优点：实现简单，需要同步的方法使用synchronized就好
    public synchronized void withDraw(double money){
        double before = this.getBalance();
        double after = before - money;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setBalance(after);
    }
}
