package com.itpw.day13.集合.collection.list_2.linklist;

import java.util.LinkedList;
import java.util.List;
import java.util.Currency;

/*
    链表的优点:
        链表上的元素在不占据连续的内存地址空间
        增删改不会有大量元素位移，效率高

    链表的缺点：
        查找效率低，正是因为内存地址空间不连续
        所以失去了随机读取的特性，不能根据下标随意获取链表值，
        必须从头到尾遍历才能获取，故查找效率低
*/
public class LinkedListDemo01 {
    public static void main(String[] args) {
        // LinkedList集合底层也是有下标的
        // 因为LinkedList底层是一个双向链表,所以增删改效率高,但是查的效率低
        List linkList = new LinkedList();
        linkList.add(100);
        linkList.add(200);
        linkList.add(50);
        for (int i = 0; i < linkList.size(); i++) {
            System.out.println(linkList.get(i));
        }
    }
}
