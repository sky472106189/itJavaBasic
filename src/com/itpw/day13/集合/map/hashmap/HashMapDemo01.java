package com.itpw.day13.集合.map.hashmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
HashMap集合
    1、HashMap底层是哈希表/散列表的数据结构
    2、哈希表是一个数组+单向链表的结合体
        哈希表因为是数组和链表的融合,所以充分发挥它们各自的优点
    3、HashMap集合底层的源代码:
        public class HashMap{
            //HashMap底层实际就是一个数组(一维数组).
            Node<K,V>[] table;

            //静态内部类HashMap.Node
            static class Node<K,V>{

                final int hash;//哈希值(哈希值是key的hashCode()方法执行的结果,而数组下标又来自哈希值进行&位操作的结果)
                final K key;//存储到Map集合中的那个key
                V value;//存储到Map集合中的那个value
                Node<K,V> next;//下一个节点的内存地址

                //总结:Node[]数组，里面存放的都是Node,而Node本身又是一个链表（数组和链表的结合体）
            }
        }
    4、最主要掌握的是:
        map.put(k,v)
        v = map.get(k)
        以上这两个方法的实现原理,是必须掌握的.
    5、HashMap集合的key部分特点:
        无序,不可重复
        为什么无序?因为key的hadeCode()方法得到的数组下标,是不会按顺序的
        不可重复?是靠equals()方法来保证HashMap集合的key不可重复
        如果key重复了,value会覆盖

        放在HashMap集合key部分的元素其实就是放到了HashSet中了.
        所以HashSet集合中的元素也需要同时重写hashCode()+equals()方法.

    6、哈希表HashMap使用不当时无法发挥性能!
        假设所有的hadeCode()返回值为固定值,那么HashMap底层会变成纯单向链表.
        这种情况我们称为:散列分布不均匀.
        什么是散列分布均匀.
            假设有100个元素,10个单向链表,那么每个单向链表上挂10个节点,这是最好的.
            是散列分布均匀的.

    7、重点:HashMap和HashSet中的元素需要同时重写hashCode()+equals()
    8、HashMap集合的默认初始化容量是16,默认加载因子是0.75
        这个默认加载因子是当HashMap集合底层数组的容量达到75%的时候,数组开始扩容

    重点:HashMap集合初始化容量必须是2的倍数,这也是官方推荐的.因为底层用到了&位运算去确定数组下标，
    此值的关键是&15，&31，&63.具体获得可以参考子网掩码
    这是因为达到散列均匀,为了提高HashMap集合的存取效率,所必须的.
*/
public class HashMapDemo01 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"张三");
    }
}
