package com.itpw.day13.lambda;

import java.util.Comparator;
import java.util.function.Consumer;

public class LambdaDemo01 {

    public static void main(String[] args) {

    }

    //语法格式一：无参，无返回值
    public static void test1(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我是中国人");
            }
        };
        r1.run();

        System.out.println("*******************使用lambda表达式*************************");

        Runnable r2 = ()->{
            System.out.println("lambda后我是中国人");
        };
        r2.run();
    }

    // 语法格式二：Lambda需要一个参数，但是没有返回值
    public static void test2(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("需要一个参数没有返回值");

        System.out.println("*******************使用lambda表达式*************************");

        Consumer<String> con1 = (String s)->{
            System.out.println(s);
        };
        con1.accept("lambda后需要一个参数没有返回值");
    }

    //语法格式三：数据类型可以省略，因为可由编译器推断得出，称为"类型推断"
    public static void test3(){
        Consumer<String> con1 = (String s)->{
            System.out.println(s);
        };
        con1.accept("类型推断是什么？");

        System.out.println("*******************使用lambda表达式*************************");

        Consumer<String> con2 = (s)->{
            System.out.println(s);
        };
        con2.accept("lambda有泛型就有了类型推断");
    }

    //语法格式四：Lambda若只需要一个参数时，参数的小括号可以省略
    public static void test4(){
        Consumer<String> con1 = (String s)->{
            System.out.println(s);
        };
        con1.accept("只需要一个参数时参数小括号可以省略");

        System.out.println("*******************使用lambda表达式*************************");

        Consumer<String> con2 = s->{
            System.out.println(s);
        };
        con2.accept("lambda小括号的省略");
    }

    //语法格式五：Lambda需要两个及以上的参数，多条执行语句时，且有返回值
    public static void test5(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1,Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };
        System.out.println(com1.compare(12,21));

        System.out.println("*******************使用lambda表达式*************************");

        Comparator<Integer> com2 = (o1,o2)->{
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };
        System.out.println(com2.compare(12,21));
    }

    //语法格式六：当Lambda体只有一条语句时，return与大括号若有，都可以省略
    public static void test6(){
        Comparator<Integer> com1 = (o1,o2)->
             o1.compareTo(o2);

        System.out.println(com1.compare(12,21));
    }

}
