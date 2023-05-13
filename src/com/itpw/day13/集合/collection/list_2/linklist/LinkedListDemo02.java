package com.itpw.day13.集合.collection.list_2.linklist;

import java.util.LinkedList;

/*
* 用双向链表模拟队列和栈
*   1、队列：先入先出FIFO
*   2、栈：先入后出FILO
* */
public class LinkedListDemo02 {
    public static void main(String[] args) {
        // 1、队列
        LinkedList<String> queue = new LinkedList<>();
        // 入队 (双向链表末尾添加元素)
        queue.addLast("一号");
        queue.addLast("二号");
        queue.addLast("三号");
        queue.addLast("四号");

        // 出队 （双向链表从头输出）
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());

        // 1、栈
        LinkedList<String> stack = new LinkedList<>();
        // 入栈
        stack.push("子弹1");
        stack.push("子弹2");
        stack.push("子弹3");
        stack.push("子弹4");
        // 出栈
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
