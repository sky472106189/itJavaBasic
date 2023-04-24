package com.itpw.day05.继承;

/*
* 继承的作用
*   1.子类继承父类，代码可以得到复用
*   2.(重点)有继承才有方法覆盖和多态机制
*
* 继承的相关特性
*   1.java继承只支持单继承，不支持多继承
*   2.java存在间接继承。即class C extends B;class B extends A;也就是C直接继承B，C间接继承A
*   3.子类继承父类后，除构造方法外，剩下都可以继承。但是私有属性无法在子类中直接访问
*   4.java中的类默认继承Object类，Object类是根类。即一个对象与生俱来有Object类的所有特征
*   5.缺点，继承导致耦合度高，父类修改会导致子类也发生变动
* */
public class ExtendsDemo02 {
    // 使用继承解决代码复用
    public static void main(String[] args) {
        Account1 act1 = new Account1("1111,",1000);
        System.out.println(act1.getActno()+",余额"+act1.getBalance());

        CreditAccount1 ca1 = new CreditAccount1();
        ca1.setActno("2222");// 间接访问父类私有属性
        ca1.setBalance(1000);
        ca1.setCredit(0.99);
        System.out.println(ca1.getActno()+",余额"+ca1.getBalance()+",信誉度"+ca1.getCredit());

    }
}

// 银行账户类
// 账户 余额
class Account1{
    private String actno;
    private double balance;

    public Account1(){};

    public Account1(String actno, double balance) {
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
class CreditAccount1 extends Account1{
    private double credit;

    public CreditAccount1(){}

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}