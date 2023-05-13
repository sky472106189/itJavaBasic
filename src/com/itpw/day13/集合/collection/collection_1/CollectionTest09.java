package com.itpw.day13.集合.collection.collection_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* 迭代器快照导致的删除问题
* */
public class CollectionTest09 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("李五");

        // 增强for循环是语法糖，反编译执行的是Iterator迭代器
        // 删除方法执行的是集合list的删除方法，那么会导致集合结构破坏，和刚开始Iterator获取的
        // 集合结构不一致，就会报错 ConcurrentModificationException
        // 这个可以参考ArrayList底层中的modCount元素，源码如下，参考源码注释。
        //     protected transient int modCount = 0;
        // 其中Iterator中expectedModCount会去频繁比对modCount，如果不同就报错。这也是快照机制的
        // for (String s : list) {
        //     if(s.contains("李")){
        //         list.remove(s);
        //     }
        // }

        // 通过迭代器的删除方法就能避免错误
        // 其关键是迭代器的remove方法会执行expectedModCount = modCount;同步此值
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            if(str.contains("李")){
                it.remove();
            }else{
                System.out.println(str);
            }
        }
    }

    //补充一句：
    // ArrayList的remove方法都会执行fastRemove，其目的是数组部分元素前移，
    // 使用的是C++底层的数组拷贝
}
