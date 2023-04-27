package com.itpw.day06.superlearn;

/*
    在恰当的时间使用super(参数列表);
        注意：ca1在构造方法执行过程中调用了父类的构造方法，父类的构造又继续向上调用父类，
    但是实际上对象只创建了一个
        super(实参)的作用：初始化当前对象的父类型特征，并没有创建新对象。
*/
public class SuperDemo03 {
    public static void main(String[] args) {
        CreditAccount ca1 = new CreditAccount();
        System.out.println("卡号"+ca1.getActno()+"\t余额"+ca1.getBalance()+"\t信誉度"+ca1.getCredit());
        CreditAccount ca2 = new CreditAccount("1111",10000,0.99);
        System.out.println("卡号"+ca2.getActno()+"\t余额"+ca2.getBalance()+"\t信誉度"+ca2.getCredit());
    }

}

class Account {
    private String actno;
    private double balance;

    public Account() {
    }

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

class CreditAccount extends Account {
    //子类特有的属性
    private double Credit;

    public CreditAccount() {
    }

    public CreditAccount(String actno, double balance, double credit) {
        // 子类属性无法直接访问父类的私有属性
        //this.actno = actno;
        //this.balance = balance;

        super(actno, balance);
        Credit = credit;
    }

    public double getCredit() {
        return Credit;
    }

    public void setCredit(double credit) {
        Credit = credit;
    }
}
