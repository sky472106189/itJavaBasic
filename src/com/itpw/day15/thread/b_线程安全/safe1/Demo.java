package com.itpw.day15.thread.b_线程安全.safe1;

/*
* 在实例方法上使用synchronized
* */
public class Demo {
    public static void main(String[] args) {
        Account account = new Account("6085", 10000D);

        Thread t1 = new AccountThread(account);
        Thread t2 = new AccountThread(account);
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
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