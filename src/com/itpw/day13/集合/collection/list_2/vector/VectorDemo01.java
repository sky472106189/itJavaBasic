package com.itpw.day13.集合.collection.list_2.vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/*
    Vector:
        1、底层也是一个数组
        2、初始化容量：10
            满了后扩容为原容量的2倍（ArrayList是1.5倍）
        3、Vector是线程安全的，因为方法都带有synchronized关键字
*/
public class VectorDemo01 {
    public static void main(String[] args) {
        List list = new Vector<>();
        // list.add(1);

        // 如何将集合转变为线程安全的?
        // java.util.Collection 集合接口
        // java.util.Collections 集合工具类,方便集合的操作
        // Arraylist转为线程安全集合
        List notSafe = new ArrayList();
        notSafe.add(243);
        // synchronizedList 变成线程安全的了
        List safe = Collections.synchronizedList(list);
        // 进到了Vector类调用add方法
        safe.add(123);

        // 没有输出true，说明synchronizedList方法并不是将ArrayList变成Vector
        if(safe instanceof Vector) {
            System.out.println(true);
        }
    }
}
