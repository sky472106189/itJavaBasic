package com.itpw.day13.集合.collection.collection_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/*
* forEach遍历
* */
public class CollectionTest07 {
    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<>();
        c.add("语文");
        c.add("数学");
        c.add("英语");


        // 方法参数未知时,可以使ctrl+Q展示方法的详细信息
        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                // 并不会修改，集合中的元素
                // 如果集合中元素是StringBuilder那么可以修改，分析见08
                s = "123";
            }
        });
        for (String s : c) {
            System.out.println(s);
        }

        // Consumer是函数接口，可以使用lambda
        c.forEach(s-> System.out.println(s+",好好学习天天向上"));



    }
}
