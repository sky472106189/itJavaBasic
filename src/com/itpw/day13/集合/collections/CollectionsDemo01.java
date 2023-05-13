package com.itpw.day13.集合.collections;

import java.util.*;

/*
* Collections集合工具类 比Collection多一个s别混淆
* */
public class CollectionsDemo01 {
    public static void main(String[] args) {
        // 1、public static <T> boolean addAll(Collection<? super T> c, T... elements)
        // 为集合批量增加元素
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"123","张三","554","李四");

        // 2、 public static <T> void sort(List<T> list)
        // 对集合中的元素进行排序
        Collections.sort(list);

        // 3、public static <T> void sort(List<T> list, Comparator<? super T> c)
        // 对集合集合排序，并同时定义比较器
        Collections.sort(list, (o1, o2) -> o1.length() - o2.length());

        // 4、public static void shuffle(List<?> list)
        // 打乱集合元素顺序
        Collections.shuffle(list);
    }
}
