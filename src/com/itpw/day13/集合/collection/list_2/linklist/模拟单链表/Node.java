package com.itpw.day13.集合.collection.list_2.linklist.模拟单链表;

/***
 * 节点
 */
public class Node {
    // 数据
    Object data;
    // 下一个数据内存地址
    Node next;
    public Node(){}

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
}
