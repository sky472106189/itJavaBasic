package com.itpw.day12.generic.类型通配符_4.demo01;

/*
    1、类型通配符一般是使用'?'代替具体的类型实参
    2、<?>不能作为形参，只能作为实参
*/
public class Demo {
    public static void main(String[] args) {
        Box<Number> box1 = new Box<>();
        box1.setData(100);
        showBox(box1);

        Box<Integer> box2 = new Box<>();
        // 编译报错 使用<?>就编译通过
        showBox(box2);
    }

//    public static void showBox(Box<Number> box){
//        System.out.println(box.getData());
//    }

    public static void showBox(Box<?> box){
        System.out.println(box.getData());
    }
}
