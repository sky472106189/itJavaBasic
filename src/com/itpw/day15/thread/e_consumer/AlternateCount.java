package com.itpw.day15.thread.e_consumer;

/*
 * 计数机器人A和B交替输出1 2 3 4 5 6 7 8 ...
 * */
public class AlternateCount {
    // TODO:用静态当锁无法实现这个功能，不知道为什么 等教到这里问老师
    public static Integer count = 0;

    private int i = 0;

    public static void main(String[] args) {
        AlternateCount count = new AlternateCount();
        count.setI(1);
        Thread botA = new CountBotA(count);
        Thread botB = new CountBotB(count);
        // Thread botA = new CountBotA();
        // Thread botB = new CountBotB();
        botA.setName("机器人A");
        botB.setName("机器人B");

        botA.start();
        botB.start();

        if (true) {
            while (true) {

            }
        }
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

/**
 * 机器人A
 * 负责数偶数
 */
class CountBotA extends Thread {

    private AlternateCount alternateCount;

    public CountBotA() {
    }

    public CountBotA(AlternateCount alternateCount) {
        this.alternateCount = alternateCount;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (alternateCount) {
                // 机器人B数奇数
                if (alternateCount.getI() % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + "-->" + alternateCount.getI());
                    alternateCount.setI(alternateCount.getI()+1);
                    alternateCount.notify();
                } else {
                    try {
                        alternateCount.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    // @Override
    // public void run() {
    //     while (true) {
    //         synchronized (AlternateCount.count) {
    //             // 机器人A数偶数
    //             if (AlternateCount.count % 2 == 0) {
    //                 System.out.println(Thread.currentThread().getName() + "-->" + AlternateCount.count);
    //                 AlternateCount.count++;
    //                 AlternateCount.count.notify();
    //             } else {
    //                 try {
    //                     AlternateCount.count.wait();
    //                 } catch (InterruptedException e) {
    //                     e.printStackTrace();
    //                 }
    //             }
    //         }
    //     }
    // }
}

/**
 * 机器人B
 * 负责数奇数
 */
class CountBotB extends Thread {

    private AlternateCount alternateCount;

    public CountBotB() {
    }

    public CountBotB(AlternateCount alternateCount) {
        this.alternateCount = alternateCount;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (alternateCount) {
                // 机器人B数奇数
                if (alternateCount.getI() % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + "-->" + alternateCount.getI());
                    alternateCount.setI(alternateCount.getI()+1);
                    alternateCount.notify();
                } else {
                    try {
                        alternateCount.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }


    // @Override
    // public void run() {
    //     while (true) {
    //         synchronized (AlternateCount.count) {
    //             // 机器人B数奇数
    //             if (AlternateCount.count % 2 != 0) {
    //                 System.out.println(Thread.currentThread().getName() + "-->" + AlternateCount.count);
    //                 AlternateCount.count++;
    //                 AlternateCount.count.notify();
    //             } else {
    //                 try {
    //                     AlternateCount.count.wait();
    //                 } catch (InterruptedException e) {
    //                     e.printStackTrace();
    //                 }
    //             }
    //         }
    //     }
    // }
}