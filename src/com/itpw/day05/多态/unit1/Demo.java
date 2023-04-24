package com.itpw.day05.多态.unit1;

/*
    向上转型: 子-->父
    向下转型: 父-->子
    java中允许向上转型，也允许向下转型。
    !!!无论是向上还是向下，都必须要【继承】关系!!!
*/
public class Demo {

    public static void main(String[] args) {
        // 向上转型
        Animal a1 = new Cat();
        Animal a2 = new Bird();

        /*
            分析：
            1.对于编译器来说，编译器只知道a1的类型是Animal，所以编译器
              在检查语法的时候，会去Animal.class字节码文件中找到move()方法，
              找到了，绑定上move()方法，编译通过。
              静态绑定成功(编译阶段属于静态绑定)
            2.运行阶段的时候，实际上在堆内存中创建的java对象是Cat对象，
              move的时候，真正参与move的对象是一只猫，所以运行阶段会
              动态绑定会动态执行Cat对象的move()方法，这个过程属于
              运行阶段绑定(运行阶段绑定属于动态绑定)

           多态表示多种形态：
                编译的时候一种形态
                运行的时候另一种形态
        */
        a1.move();// cat走猫步
        a2.move();// 鸟在飞


        Animal a3 = new Cat();

        // 编译无法通过
        // 分析程序一定要分析编译阶段的静态绑定和运行阶段的动态绑定
        // 只有编译通过，才会有运行阶段。
        // 错因:编译器只知道a3是Animal类型，去Animal.class文件中找catchMouse()方法失败
        //      结果没有找到，所以静态绑定失败，编译报错，无法运行。
        // a3.catchMouse(); // 错误:找不到符号

        // 如果要执行父类中没有,子类中特有的方法,就需要向下转型
        Cat x = (Cat)a3;
        x.catchMouse(); //编译通过

        // 那为什么不直接Cat a3 = new Cat()呢?
        // 后续讲解

        // 向下转型存在风险,但向上转型不存在风险
        /*
           编译通过,但是运行报错ClassCastException 类型转换异常
           这个报错和空指针异常一样重要
           分析:
               1.Animal和Cat存在继承关系,所以可以向下转型
           编译阶段的静态绑定能通过
               2.运行阶段,堆内存实际创建的对象是:Bird对象
           在实际运行时Bird对象转成Cat对象，而它们之间没有
           继承关系
        */
        Animal a4 = new Bird();
        Cat y = (Cat) a4;
        y.catchMouse();

        /*
        如何避免ClassCastException异常的发生
            使用instanceof
            1.instanceof可以在运行阶段动态判断引用指向的对象的类型
            2.instanceof语法
                (引用 instanceof 类型)
            3.instanceof运算符的运算结果只能是:true/false
            4. (C instance of Cat)返回true 表示:C引用指向堆内存的java对
            象是一个Cat类型

            程序员养成好习惯:
                任何时间地点,对类型进行向下转型时,一定使用instanceof运算符
            进行判断.可以很好避免ClassCastException异常
        */
        Animal a5 = new Bird();
        if(a5 instanceof Cat) {
            Cat y1 = (Cat) a4;
            y.catchMouse();
        }

    }

}
