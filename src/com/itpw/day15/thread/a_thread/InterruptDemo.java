package com.itpw.day15.thread.a_thread;

/*
    提前唤醒线程
    interrupt()
*/
public class InterruptDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable2());
        t.start();

        // 不希望睡1年，希望5秒后终止睡眠
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 终断t线程的睡眠，依靠的是java的异常处理机制
        t.interrupt();

    }
}
class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "->begin");
        try {
            // 注意，sleep只能try不能throws，因为子类继承的方法不能比父类抛出更多异常
            // 而父类是接口类Runnable，没有任何异常抛出，所以只能try
            // sleep 一年
            Thread.sleep(1000 * 60 * 60 * 24 * 365);
        } catch (InterruptedException e) {
            // interrupt方法实际就是走到这里，唤醒的sleep
            // 如果注释掉下面的代码，就不会有红色Exception打印了
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "->over");
    }

}
