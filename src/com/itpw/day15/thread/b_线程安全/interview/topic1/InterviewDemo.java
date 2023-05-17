package com.itpw.day15.thread.b_线程安全.interview.topic1;

/*
    面试题：doOther方法在执行前需要等待doSome方法结束吗？
    不需要，因为synchronized修饰的实例方法，只会同步该方法体，doOther没有同步要求
*/
public class InterviewDemo {
    public static void main(String[] args) throws InterruptedException {
        MyClass mc = new MyClass();
        Thread t1 = new MyThread(mc);
        Thread t2 = new MyThread(mc);
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

    public void doOther() {
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }
}
