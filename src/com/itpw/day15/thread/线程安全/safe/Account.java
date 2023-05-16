package com.itpw.day15.thread.线程安全.safe;

/**
 * 银行账户
 */
public class Account {
    private String actNo;
    private double balance;

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

    // 取款方法
    public  void withDraw(double money){
        // 以下方法必须同步执行，既只能允许一个线程进来，进来完成后才能放开
        // synchronized(this) 括号中的this是关键，因为此场景中的Account是共享的
        // 每进来一个对象执行取款方法，
        synchronized(this){
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
}
