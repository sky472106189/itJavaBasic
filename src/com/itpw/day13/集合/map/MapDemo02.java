package com.itpw.day13.集合.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/*
    Map的遍历
*/
public class MapDemo02 {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");

        // 1、keySet() 获取所有key，通过key遍历Map
        Set<Integer> keySet = map.keySet();
            //1.1 通过迭代器
        // Iterator<Integer> it = keySet.iterator();
        // while(it.hasNext()){
        //     Integer key = it.next();
        //     String value = map.get(key);
        //     System.out.println(key+"="+value)
        //     System.out.println();
        // }
            //1.2 通过增强for循环也行（看.class文件实际上就是迭代器遍历）
        for (Integer key : keySet) {
            System.out.println(map.get(key));
        }

        // 2、Set<Map.Entry<K,V>> entrySet()
        // Map集合中的key和value全部转换成Set集合
        Set<Map.Entry<Integer, String>> set = map.entrySet();
            //2.1 通过迭代器
        Iterator<Map.Entry<Integer, String>> iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> node = iterator.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key+"="+value);
            System.out.println(node);
        }
            //2.2 通过增强for循环
        // for (Map.Entry<Integer, String> node : set) {
        //     System.out.println(node.getKey()+"="+node.getValue());
        // }

        //3、forEach遍历（最常用）
        // map.forEach(new BiConsumer<Integer, String>() {
        //     @Override
        //     public void accept(Integer integer, String s) {
        //         System.out.println("key="+integer+" value="+s);
        //     }
        // });
            //使用lambda简化
        map.forEach((key,value)-> System.out.println("key="+key+" value="+value));
    }
}
