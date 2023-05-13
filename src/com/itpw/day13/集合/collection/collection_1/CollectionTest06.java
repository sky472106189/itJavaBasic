package com.itpw.day13.集合.collection.collection_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/*
 *   迭代器的“快照”机制：一旦集合的结构发生改变，迭代器就需要重新获取
 * 否则报错java.util.ConcurrentModificationException
 *   常见于迭代过程中使用集合中的remove()方法导致结构发生改变，接着迭代发生的错误
 *
 *  这个可以参考ArrayList底层中的modCount元素，源码如下，参考源码注释。
 *      protected transient int modCount = 0;
 *  其中Iterator中expectedModCount会去频繁比对modCount，如果不同就报错。这也是快照机制的
 * 原理
 * */
public class CollectionTest06 {
    public static void main(String[] args) {
        // Collection c = new ArrayList();
        // 注意:集合结构发生改变，迭代器就要重新获取
        // 否则报错:java.util.ConcurrentModificationException
        // 可以把迭代器比作拍照，获取时会拍下集合当前结构，当结构发生变化，必须重新“拍”一张
        // 底层会有一个机制，一旦迭代器拍下的集合，和原集合有差别就会报错
        // c.add(0);
        // Iterator it = c.iterator();
        // c.add(1);
        // System.out.println(it.next());

        Collection c2 = new ArrayList();
        c2.add(1);
        c2.add(0);
        c2.add(0);
        c2.add(4);
        Iterator it2 = c2.iterator();
        while (it2.hasNext()) {
            Object obj = it2.next();
            // // 使用ArrayList()中的remove()方法（报错）
            // // 直接通过集合删除元素，没有通知迭代器，导致迭代器的快照和删后集合状态不同
            // c2.remove(obj);
            // // 使用迭代器Iterator()中的remove()方法（通过）
            // it2.remove();

            // 删除指定元素
            if (obj.equals(0)) {
                it2.remove();
            }
        }
        System.out.println(c2.size());

    }
}
