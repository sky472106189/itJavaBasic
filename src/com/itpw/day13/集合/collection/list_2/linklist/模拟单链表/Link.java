package com.itpw.day13.集合.collection.list_2.linklist.模拟单链表;

/***
 * 链表类
 */
public class Link {

    // 头结点(不存数据)
    Node header = new Node(null, null);

    int size = 0;

    /**
     * 向链表添加元素(尾插法)
     * @param obj
     */
    public void add(Object obj) {
        Node currentLastNode = findLast(header);
        currentLastNode.next = new Node(obj, null);
        size++;
    }

    /***
     * 寻找尾部节点(递归)
     * @param node
     * @return
     */
    public Node findLast(Node node) {
        if (node.next == null) {
            return node;
        } else {
            return findLast(node.next);
        }
    }

}
