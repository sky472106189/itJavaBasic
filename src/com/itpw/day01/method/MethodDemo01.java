package com.itpw.day01.method;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* void返回类型
*   不会修改基本类型的值，String的值
*     会修改数组,Map,List的值
* */
public class MethodDemo01 {
    public static void main(String[] args) {
        //void并不会修改基本类型的值
        Integer i = 2;
        func1(i);
        System.out.println(i);  //输出2

        //void不会修改String的值
        String str = "未修改";
        func2(str);
        System.out.println("String="+str);

        //void会修改数组的值
        int[] array = {1};
        func4(array);
        System.out.println(array[0]);

        //void会修改Map的值
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"abc");
        func3(map);
        System.out.println(map.get(1));

        //void会修改List的值
        List<String> list = new ArrayList();
        list.add(0,"未修改");
        func5(list);
        System.out.println(list.get(0));

    }
    public static void func1(Integer i){
        i = 3;
    }

    public static void func2(String str){
        str = "已修改";
    }

    public static void func3(Map<Integer,String> map){
        map.put(1,"func3修改");
    }

    public static void func4(int[] array){
        array[0] = 2;
    }

    public static void func5(List<String> list){
        list.add(0,"已修改");
    }
}
