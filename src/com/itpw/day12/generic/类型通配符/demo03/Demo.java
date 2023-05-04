package com.itpw.day12.generic.类型通配符.demo03;

import com.itpw.day12.generic.类型通配符.demo02.Box;

/*
    类型通配符的上限
        语法：
            类/接口<? super 实参类型>
        要求该泛型的类型，只能是实参类型，或实参类型的父类

    类型通配符上限的底层应用体现在TreeSet
    public TreeSet(Comparator<? super E> comparator)
    可以传入E及E的父类比较器
*/
public class Demo {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box();
        showBox(box1);
        Box<Number> box2 = new Box();
        showBox(box2);

        Box<String> box3 = new Box<>();
        // 编译报错 String不是Integer的父类
        //showBox(box3);
    }

    public static void showBox(Box<? super Integer> box){
        System.out.println(box.getData());
    }
}

