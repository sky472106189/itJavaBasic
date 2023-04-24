package com.itpw.day05.object类;

public class ObjectAnalysis {
    // ObjectAnalysis默认继承根类Object，故继承了Object的toString()方法
    // 不过toString()方法是实例方法，需要先创建对象才能调用
    /*
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }*/

    public static void main(String[] args) {
        // 编译不通过
        // ObjectAnalysis.toString();
        ObjectAnalysis obj = new ObjectAnalysis();
        // 10f87f48 实际上是内存地址经过“哈希算法”得出的十六进制地址
        System.out.println(obj.toString());// ObjectAnalysis@10f87f48
    }
}
/*
public class Object {

    // 当源码当中 一个方法没有{}修饰且以;结尾，并且修饰符列表中有native关键字
    // 表示底层调用C++写的dll程序(dll动态链接库文件)
    private static native void registerNatives();

    // 静态代码块
    static {
        // 调用registerNatives()方法
        registerNatives();
    }

    // 无参构造方法
    @HotSpotIntrinsicCandidate
    public Object() {}

    // 底层调用C++
    @HotSpotIntrinsicCandidate
    public final native Class<?> getClass();

    // 底层调用C++
    @HotSpotIntrinsicCandidate
    public native int hashCode();

    public boolean equals(java.lang.Object obj) {
        return (this == obj);
    }

    // 已有对象A，想创建一个和A一模一样的对象，可以调用cloe()方法
    // 底层调用C++
    @HotSpotIntrinsicCandidate
    protected native java.lang.Object clone() throws CloneNotSupportedException;

    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    @HotSpotIntrinsicCandidate
    public final native void notify();

    @HotSpotIntrinsicCandidate
    public final native void notifyAll();


    public final void wait() throws InterruptedException {
        wait(0L);
    }

    public final native void wait(long timeoutMillis) throws InterruptedException;

    public final void wait(long timeoutMillis, int nanos) throws InterruptedException {
        if (timeoutMillis < 0) {
            throw new IllegalArgumentException("timeoutMillis value is negative");
        }

        if (nanos < 0 || nanos > 999999) {
            throw new IllegalArgumentException(
                    "nanosecond timeout value out of range");
        }

        if (nanos > 0 && timeoutMillis < Long.MAX_VALUE) {
            timeoutMillis++;
        }

        wait(timeoutMillis);
    }

    @Deprecated(since="9")
    protected void finalize() throws Throwable { }
}*/
