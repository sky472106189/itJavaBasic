package com.itpw.day15.thread.线程安全.safe;

/*
    线程同步机制语法:
        synchronized (){
            //线程同步代码块
        }
    synchronized () 括号中的值，很关键，这个值必须是多线程共享的数据。才能达到多线程排队
    ()中写什么，取决于想让哪些线程同步。
        场景：假设t1,t2,t3,t4,t5有5个线程。希望t1,t2,t3同步,t4,t5不需要同步
        那么要在()写一个t1 t2 t3共享的对象。而这个对t4 t5是不共享的
*/
public class Demo {
    public static void main(String[] args) {
        // 只有一个银行账户
        Account account = new Account("6085",10000D);

        Thread t1 = new AccountThread(account);
        Thread t2 = new AccountThread(account);
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}

class AccountThread extends Thread{

    // 两个线程必须共享同一个银行账户
    private Account account;

    public AccountThread(Account account){
        this.account = account;
    }

    @Override
    public void run() {
        account.withDraw(5000);
        System.out.println(Thread.currentThread().getName()+"线程取款5000成功,余额:"+account.getBalance());
    }
}