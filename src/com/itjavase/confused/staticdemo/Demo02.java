package com.itjavase.confused.staticdemo;

public class Demo02 {
    // 静态变量(方法区)
    static int id;
    // 实例变量(堆)
    double score;

    // 静态方法
    public static void doSomeStatic(){
        // score,doSome()编译报错，这是因为实例，在类加载后并没有实际存在堆中
        // 而类加载后的静态变量是已经存放在了方法区，故可以直接访问
        id = 1;
        // score = 10;
        // doSome();
    }
    // 实例方法
    public void doSome(){
        // 实例方法能直接调用静态和实例，为什么？
        // 静态是类级别的，随着类加载就已经存放。
        // 实例是对象级别的，每一次实例调用前都需要new出来，所以放在类加载之后完成
        // 那么能调用实例方法的前提就是类加载后，再new对象，那么显然是既能访问到堆中的
        // 实例对象，又能访问到方法区中的静态对象的
        doSomeStatic();
        id = 1;
        score = 10;
    }
}
