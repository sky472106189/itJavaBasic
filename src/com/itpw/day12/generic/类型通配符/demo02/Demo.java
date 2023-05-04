package com.itpw.day12.generic.类型通配符.demo02;

/*
    类型通配符的上限
        语法：
            类/接口<? extends 实参类型>
            解释:只能传实参以及实参的子类

        例子：
        Box<? extends Number>
            解释：只能传Number以及Number的子类。
*/
public class Demo {
    public static void main(String[] args) {
        Box<Number> box1 = new Box<>();
        box1.setData(100);
        showBox(box1);

        Box<Integer> box2 = new Box<>();
        showBox(box2);

        Box<String> box3 = new Box<>();
        // String 不属于Number的子类 编译报错
        //showBox(box3);
    }

    public static void showBox(Box<? extends Number> box){
        System.out.println(box.getData());
    }
}