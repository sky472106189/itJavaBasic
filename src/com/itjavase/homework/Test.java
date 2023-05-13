package com.itjavase.homework;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;

/*
- 使用TreeMap集合保存学生对象信息,要求创建不低于五个学生对象
- 集合添加元素时，要求以学生对象为键,住址为值
- TreeMap集合按照学生的年龄从大到小排序后，遍历集合并输出键值内容，输出格式不做要求
*/
public class Test {
    public static void main(String[] args) {
        Map<Student,Integer> map = new HashMap<>();
        map.put(new Student(),1);

        map.forEach((k,v)->{
            System.out.println(k+"--"+v);
        });
    }
}
