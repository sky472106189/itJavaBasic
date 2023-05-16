package com.itpw.day15.thread.线程安全.unsafe;

/*
    模拟多线程对同一银行账户取款，出现线程安全问题
    场景:用户t1和用户t2同时取5000元，按道理去玩余额为0，但是刷新余额期间存在网络波动
    延迟100ms，导致t1和t2取完后，仍有5000元
*/
public class Demo {
    public static void main(String[] args) {
        // 只有一个银行账户
        Account account = new Account("6085",10000D);

        //
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