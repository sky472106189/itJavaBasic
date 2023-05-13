package com.itpw.day13.集合.collection.set_3.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    HashSet：无序不可重复
        无序:取出来的顺序和存入的顺序不一致
        注意区分和TreeSet的区别，HashSet不会排好序，TreeSet会排好序
        HashSet底层是按照hashCode后的值再执行哈希函数后作为下标放入
    HashSet中的元素实际上是放入HashMap集合中key部分了
*/
public class HashsetDemo01 {
    public static void main(String[] args) {
        //存进去2341,取出来却使1234,Set接口下的都是无序不可重复的,只不过HashSet会从小到大排序？
        //注意:HashSet并不会进行排序,是进行了hashCode()方法计算.由于SUN公司的方法很精妙
        //所以会给程序员一种HashSet会自动排序的错觉,如果你添加的值过大，比如199,400仍是会乱序的
        Set c1 = new HashSet();
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(1);
        Iterator iterator = c1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Set c2 = new HashSet();
        c2.add(200);
        c2.add(330);
        c2.add(40);
        c2.add(100);
        for (Object o : c2) {
            System.out.print(o+"\t");
        }
    }
}
