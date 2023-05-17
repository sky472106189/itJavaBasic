package com.itpw.day15.thread.b_线程安全.interview.topic2;

/*  (错了)
    面试题：doOther方法在执行前需要等待doSome方法结束吗？
    需要，一个对象一把锁!
    因为当t1进入拿到doSome方法的锁后且不放手,那么t2再进入想拿到doOther的锁是拿不到的，因为一个对象一把锁
    所以只有等t1将锁释放才行。线程t1和线程t2操作的都是同一个对象，所以只有一把锁。
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

    public synchronized void doOther() {
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }
}
