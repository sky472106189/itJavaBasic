package com.itpw.day15.thread.b_线程安全.safe;

/**
 * 银行账户
 */
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

    /*
        以下代码的执行原理?
        1.假设t1和t2线程并发,开始执行以下代码的时候,肯定有一个先一个后.
        2.假设t1先执行了,遇到了synchronized,这个时候自动找"后面共享对象"的对象锁.
        找到之后,并占有这把锁,然后锁定执行同步代码块中的程序,在程序执行过程中,一直
        都是占有这把锁的.直到同步代码块结束,这把锁才会释放.
        3.假设t1已经占有这把锁,此时t2也遇到synchronized关键字,也会去占有后面共享
        对象的这把锁,结果这把锁被t1占用,t2只能在同步代码块外面等待t1结束,直到t1把
        同步代码块执行结束了,t1会归还这把锁,此时t2终于等到这把锁,然后t2占有这把锁
        之后,进入同步代码块执行程序.

        这样就达到了线程排队执行,线程同步机制.
        这里需要注意的是:这个共享对象一定要选好了.这个共享对象一定是你需要排队执行的
        这些线程对象所共享的.
    */
    // 取款方法
    public  void withDraw(double money){
        // 以下方法必须同步执行，既只能允许一个线程进来，进来完成后才能放开
        // synchronized(this) 括号中的this是关键，因为此场景中的Account是共享的
        // 每进来一个对象执行取款方法，都会比较this指向的引用，发现是同一个Account
        // 所以会出现同步等待，直到先进入的执行结束，等待的才能进入。
        synchronized(this){ // 能实现
        // synchronized("abc"){ // 能实现同步，因为"abc"在字符串常量池中
        // synchronized(Integer.valueOf(-128)){ // 能实现-128到127的Integer对象统一放在堆内存的整数型常量池中
        // synchronized(obj){ // 同一对象中的实例变量也能实现同步
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
