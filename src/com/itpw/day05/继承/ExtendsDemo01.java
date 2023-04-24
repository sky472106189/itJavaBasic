package com.itpw.day05.继承;

public class ExtendsDemo01 {
    // 代码臃肿
    public static void main(String[] args) {
        Account act = new Account("1111,",1000);
        System.out.println(act.getActno()+",余额"+act.getBalance());

        CreditAccount ca = new CreditAccount();
        ca.setActno("2222");
        ca.setBalance(1000);
        ca.setCredit(0.99);
        System.out.println(ca.getActno()+",余额"+ca.getBalance()+",信誉度"+ca.getCredit());
    }
}

// 银行账户类
// 账户 余额
class Account{
    private String actno;
    private double balance;

    public Account(){};

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// 信用卡账号
// 账户 余额 信誉度
class CreditAccount{
    private String actno;
    private double balance;
    private double credit;

    public CreditAccount(){}

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
