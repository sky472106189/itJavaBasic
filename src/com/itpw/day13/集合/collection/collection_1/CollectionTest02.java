package com.itpw.day13.集合.collection.collection_1;

import java.util.*;

/*
    迭代器的使用(重点:五颗星)
        Iterator<E> iterator()
    该方法来自于Collection的父接口Iterable

    注意：迭代器适用于所有的Collection以及子类使用
    Map不能使用迭代器
*/
public class CollectionTest02 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        //添加元素
        collection.add(1);
        collection.add("你好");
        collection.add(new Object());
        //第一步:获取集合对象的迭代器对象Iterator
        Iterator it = collection.iterator();
        //第二步,通过迭代器对象it开始迭代(遍历)集合
        /*
            boolean hasNext() 如果仍有元素,则返回true.
            Object next() 返回迭代的下一个元素，并且指针后移。
        */

        while(it.hasNext()){
            System.out.println(it.next());
        }


        /******************************************************************************************/

        // 以下是对迭代器如何生成，源码的一些探究
        /*
        Collection接口继承Iterable接口，而Collection接口的iterator()方法就是来自Iterable接口
        并且iterator()方法生成了一个Iterator对象，这个才是迭代器

        定义Collection collection = new HashSet();后
        collection.iterator()本质上就是new HashSet().iterator()
        通过HashSet类中的iterator()方法
            源码如下：
                public Iterator<E> iterator() {
                    return map.keySet().iterator();
                }
        总之就是得到一个iterator对象
        */

        /*
        ArrayList中的迭代器iterator 是通过实例内部类的方式构造出来的
        iterator()方法执行 return new Itr(); 这是因为Itr()内部类是用
        private修饰的，只能通过类内部其他公开方法访问到
        其内部类格式如下:
            private class Itr implements Iterator<E>{}
        实现了Iterator接口，故Itr()就是一个迭代器的实现类
        */
        ArrayList arrayList = new ArrayList();
        Iterator iterator = arrayList.iterator();
    }
}
