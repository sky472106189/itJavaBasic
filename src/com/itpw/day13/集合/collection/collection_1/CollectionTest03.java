package com.itpw.day13.集合.collection.collection_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
* ArrayList 有序可重复(存入什么顺序，取出就是什么顺序)
* HashSet 无序不可重复(存入顺序和取出顺序无关)
* */
public class CollectionTest03 {
    public static void main(String[] args) {
        Collection c = new ArrayList();// 有序可重复(存入什么顺序，取出就是什么顺序)
        c.add(1);
        c.add("123");
        c.add(3.4D);

        Iterator it = c.iterator();
        while(it.hasNext()){
            // 虽然是Object类，但是实际上存入什么类型，取出来的也是什么类型
            Object obj = it.next();
            if(obj instanceof Integer){
                System.out.println("Integer类型");
            }else if(obj instanceof String){
                System.out.println("String类型");
            }else if(obj instanceof Double){
                System.out.println("Double类型");
            }
            System.out.println(obj);
        }
    }
}
