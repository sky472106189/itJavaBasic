package com.itpw.day10.stringbuffer;

import com.itpw.day08.访问控制权限.modify01.F;

/*
* StringBuffer执行append方法过多后 导致OOM堆内存溢出 异常
* 为什么？
*   当追加超过的StringBuffer等byte[]数组的长度后，就会执行底层的数组拷贝方法。
* 其拷贝方法原理就是new一个较大的新数组，再把老数组一一拷贝进去。当byte[]数组过大时
* 此时new一个很大容量，是很容易导致堆内存溢出的。
*
*   这也回答了为什么要将char[]数组改成byte[]数组。因为char在java中占2B，而byte占1B，
* byte更小，当数组扩容时更容易避开数组空间开辟过大导致的堆内存OOM。
* */
public class StringBufferDemo03 {

    public static void main(String[] args) {
        // 执行以下四行就会OOM 堆内存溢出
        // java.lang.OutOfMemoryError: Java heap space
        byte[] copy = new byte[1207959552];
        byte[] copy1 = new byte[1207959552];
        byte[] copy2 = new byte[1207959552];
        byte[] copy3 = new byte[1207959552];

    }
}
