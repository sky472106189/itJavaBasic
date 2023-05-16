package com.itpw.day15.thread.线程安全.unsafe;

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
    public void withDraw(double money){
        // 取款之前的余额
        double before = this.getBalance();
        // 取款后的余额
        double after = before - money;
        // 模拟网络波动，延迟100ms更新余额
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 更新余额
        this.setBalance(after);
    }
}
