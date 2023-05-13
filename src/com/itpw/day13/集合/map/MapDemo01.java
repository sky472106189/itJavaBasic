package com.itpw.day13.集合.map;

import java.util.*;

/*
java.util.Map接口中常用的方法:
    1.Map和Collection没有继承关系
    2.Map集合以key和value的键值对存储数据
        key和value都是引用数据类型.
        key和value都是存储对象的内存地址.
        key起到主导的地位,value是key的附庸品.
    3.Map接口中常用的方法
        3.1)  public V put(K key,V value):向Map集合中添加键值对
        3.2)  public V get(Object key):通过key,获取value
        3.3)  public void clear():清空Map集合
        3.4)  public boolean containsKey(Object key):判断Map中是否包含某个key
        3.5)  public boolean containsValue(Object value):判断Map中是否包含某个value
        3.6)  public boolean isEmpty():判断Map集合中元素个数是否为0;
        3.7)  public Set<K> keySet():获取Map集合所有的key
        3.8)  public Collection<V> values():获取Map集合中所有的value
        3.9)  public V remove(Object key):通过key删除value
        3.10) public int size():获取Map集合中键值对的个数
        3.11) public Set<Map.Entry<K,V>> entrySet():将Map集合转换成Set集合
         解释:3.11方法
         注意:
             1、Map集合通过entrySet()方法转换成这个Set集合,集合中元素的类型是Map.Entry<K,V>
             2、Map.Entry是一种类class的名字,只不过Map.Entry是Map中的静态内部类
             3、结构大致如下
                 public class Map{
                     // 静态内部类
                     private static class Entry{
                         ...
                     }
                 }

*/
public class MapDemo01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        // 1、put(k,v)
        map.put(1,"张三");
        map.put(2,"王五");
        map.put(3,"李四");
        map.put(4,"小刚");

        // 2、get(key) 通过key获取value
        String value = map.get(1);
        System.out.println(value);//张三

        // 3、size()获取键值对的数量
        System.out.println(map.size());//4

        // 4、remove(key) 通过key删除value
        map.remove(2);
        System.out.println(map.size());//3

        // 5.1、containsKey(key) 注意:时间复杂度O(1)
        // 判断是否包含某个key
        System.out.println(map.containsKey(3));//true
        // 5.2、containsValue(value)
        //判断是否包含某个value
        System.out.println(map.containsValue("小刚"));//true
        //注意:contains和collection接口的底层类似,都是调用的equals()方法.所以自定义类要长些equals()方法.

        // 6、keySet() 获取所有Key
        Set<Integer> keySet = map.keySet();

        // 7、values() 获取所有value
        Collection<String> list = map.values();
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // 8、entrySet()
        //将Map集合转换成Set集合
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();

        // 9、clear() 清空集合+判断是否为空
        map.clear();
        System.out.println(map.isEmpty());//true

    }
}
