package com.itpw.day15.thread.b_线程安全.interview.topic3;

/*
    面试题：doOther方法在执行前需要等待doSome方法结束吗？
    不需要，因为一个对象一把锁
    线程t1操作的mc1对象，线程t2操作的mc2对象，对象不同，锁不生效
*/
public class InterviewDemo {
    public static void main(String[] args) throws InterruptedException {
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        Thread t1 = new MyThread(mc1);
        Thread t2 = new MyThread(mc2);
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        Thread.sleep(1000);// 此行sleep是为了保证t1先执行
        t2.start();
    }
}

class MyThread extends Thread {
    private MyClass mc;

    public MyThread(MyClass mc) {
        this.mc = mc;
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("t1")) {
            mc.doSome();
        }
        if (Thread.currentThread().getName().equals("t2")) {
            mc.doOther();
        }
    }
}


class MyClass {

    public synchronized void doSome() {
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }

    public synchronized void doOther() {
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }
}
