package com.itpw.day13;

import java.util.*;

/*
* 分析HashMap底层put方法源码
* */
public class AnalysePutMethodSource {

    public static void main(String[] args) {

        // String[] str = new String[]{"AaAaAa","AaAaBB","AaBBAa","AaBBBB",
        //         "BBAaAa","BBAaBB","BBBBAa","BBBBBB"};
        // 哈希值都相同
        // for (String s : str) {
        //     System.out.print(s.hashCode());
        // }

        HashMap<Person,String> map = new HashMap<>();
        map.put(new Person("AaAaAa", "张三"),"测试1");
        map.put(new Person("AaAaBB", "李四"),"测试2");
        map.put(new Person("AaBBAa", "李四"),"测试3");
        Set<Map.Entry<Person, String>> entries = map.entrySet();
        for (Map.Entry<Person, String> entry : entries) {
            System.out.println(entry);
        }
        // map.put(new Person("AaBBBB", "李四"),"测试4");
        // map.put(new Person("BBAaAa", "李四"),"测试5");
        // map.put(new Person("BBAaBB", "李四"),"测试6");
        // map.put(new Person("BBBBAa", "李四"),"测试7");
        // map.put(new Person("BBBBBB", "李四"),"测试8");

        /* 对put源码的分析，参考代码行间注释即可

        // hash是对key进行hashCode的结果
        // value就是传入的value
        // 其他两个形参不需要关心
        final V putVal(int hash, K key, V value, boolean onlyIfAbsent,boolean evict) {
            Node<K,V>[] tab; Node<K,V> p; int n, i;
            // 对数组做非空判断，如果空则需要扩容。
            if ((tab = table) == null || (n = tab.length) == 0)
                // 扩容情景如下：
                //	1、首次put则初始化长度为16的哈希表
                //	2、若存储节点到达了75%，则自动扩容至原容量的2倍
                // resize()进行扩容
                n = (tab = resize()).length;
            // 此判断会对hash值进行&操作，得到一个数组下标，如果为null则在此下标新建元素
            if ((p = tab[i = (n - 1) & hash]) == null)
                tab[i] = newNode(hash, key, value, null);
                // 如果此时下标有元素了
            else {
                // 新建两个临时变量 Node e，和K k
                Node<K,V> e; K k;
                // 判断1.当前下标元素的哈希值是否和put元素的哈希值相同
                // 判断2.当前下标元素的key是否和put元素的key相同
                // 判断3.key不为空并且key是否equals(k)，(会进到equals()方法判断)
                // 关系是:  判断1 && (判断2 || 判断3)
                if (p.hash == hash &&
                        ((k = p.key) == key || (key != null && key.equals(k))))
                    // 总结：如果哈希值相同，并且key相同的话；或者 哈希值相同，并且equals方法返回true。就会直接顶替当前节点
                    e = p;
                    // 如果不是相同节点，并且已经成红黑树的话,就去红黑树中判断
                else if (p instanceof TreeNode)
                    e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                    // 如果不是相同节点，并且还未成红黑树，就当链表操作
                else {
                    // 去寻找当前节点后面还有节点，旨在将put元素挂载当前链表末尾
                    for (int binCount = 0; ; ++binCount) {
                        if ((e = p.next) == null) {
                            p.next = newNode(hash, key, value, null);
                            // 如果当前链表元素大于等于8，那么就会转换为红黑树
                            if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                treeifyBin(tab, hash);
                            break;
                        }
                        // 如果当前链表的下一个元素和put元素哈希值相同，并且key相同的话；或者 哈希值相同，并且equals方法返回true。就会直接跳出for循环
                        if (e.hash == hash &&
                                ((k = e.key) == key || (key != null && key.equals(k))))
                            break;
                        p = e;
                    }
                }
                //遍历链表时,有一个元素元素相同时就会替换,并且返回被替换的value值
                if (e != null) { // existing mapping for key
                    V oldValue = e.value;
                    if (!onlyIfAbsent || oldValue == null)
                        e.value = value;
                    afterNodeAccess(e);
                    return oldValue;
                }
            }
            // modCount用于和迭代器中的expectedModCount比对，不同时迭代器会报错
            ++modCount;
            // threshold是触发扩容的门槛值，取决于当前数组长度和负载因子的乘积
            // 当前散列表存储元素大于这个值时，就会扩容
            if (++size > threshold)
                resize();
            //这个方法为了继承HashMap的LinkedHashMap类服务的。
            //LinkedHashMap调用put方法时，会去到自己的类中执行此方法
            afterNodeInsertion(evict);
            //看似返回null，实际put操作已经给HashMap类中的table添加进值了
            return null;
        }*/
    }

}

class Person{
    String id;
    String name;

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        return name.equals(person.name);
    }
}
