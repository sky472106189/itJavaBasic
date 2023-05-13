package com.itpw.day13.stream流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    JDK8新特性:Stream流
        用于对集合或者数组进行便捷操作
 */
public class StreamDemo01 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        Collections.addAll(nameList,"小明","小张","哆啦A梦","小小酥");

        // 找出姓小，且是2个字的名字，存入到一个新集合中去。
        List<String> filterList = new ArrayList<>();
        for (String s : nameList) {
            if(s.startsWith("小")&&s.length()==2){
                filterList.add(s);
            }
        }
        System.out.println(filterList);

        System.out.println("----------------------------------");

        List<String> filterList1 = nameList.stream()
                .filter(s -> s.contains("小") && s.length() == 2)
                .collect(Collectors.toList());
        System.out.println(filterList1);
    }
}
