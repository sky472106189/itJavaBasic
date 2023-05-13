package com.itpw.day13.集合.collection.set_3.hashset.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/*
* LinkedHashSet
*  有序，排入顺序和取出顺序一致。
*  注意：这不符合Set集合的基本性质
* */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(0);
        set.add(0);
        set.add(-1);
        set.add(90);
        set.forEach((i)-> System.out.println(i));
    }
}
