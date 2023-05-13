package com.itpw.day13.集合.collection.list_2.linklist.模拟单链表;

public class Demo {
    public static void main(String[] args) {
        Link linkList = new Link();
        linkList.add(100);
        linkList.add(200);
        linkList.add(300);
        System.out.println(linkList.size);
        Node header = linkList.header;
        for (int i = 0; i <= linkList.size; i++) {
            System.out.println(header.data);
            header = header.next;
        }
    }

}
