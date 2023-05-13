package com.itpw.day13.集合.collection.collection_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 java.util.Collection接口的常用方法
       1、public boolean add(Object e)   向集合中添加元素
       2、public int size()  获取集合中元素的个数
       3、public void clear() 清空集合
       4、public boolean contains(Object o) 判断当前集合中是否包含元素o,包含返回true,反之亦反
       5、public boolean remove(Object o)  删除集合中的指定元素o.
       6、public boolean isEmpty() 判断集合是否为空
       7、public Object[] toArray()  调用这个方法把集合转换成数组.
*/
public class CollectionTest01 {
    public static void main(String[] args) {
        //创建一个集合对象
        // Collection c = new Collection();  接口是抽象的，无法实例化
        Collection c = new ArrayList();//多态
        c.add("java");
        c.add(new Object());
        c.add(true);

        System.out.println("集合元素个数="+c.size());

        // toArray方法
        Object[] objects = c.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }

        Collection<String> list = new ArrayList<>();
        list.add("123");
        list.add("321");
        list.add("000");
        // toArray方法的缺陷:指定了泛型数组返回的仍然是Object类型
        // Object[] objs = list.toArray();
        // 解决方法：toArray(T[] a)
        String[] strings = list.toArray(new String[]{});
        Iterator<String> iterator = list.iterator();
    }
}
