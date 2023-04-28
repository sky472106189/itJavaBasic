package com.itpw.day06.finallearn;

/*
    final修饰的实例变量，一般添加static修饰，static修饰后变量就是类级别了，变为静态变量
    存储在方法区。
    常量和静态变量类似，都存储在方法区，并且都在类加载时初始化。不同在于：常量的值不能变。

    结论：
        static final联合修饰的变量称为常量，常量名全部大写，每次单词采用下划线连接

*/
public class FinalDemo04 {
    public static void main(String[] args) {
    }
}

// 中国人
class Chinese{
    String idCard;
    String name;
    // 实例对象在堆中，1个对象1份，100个对象就有100份
    // 而国家是一个固定值，用final修饰
    //final String country = "中国";

    // 这样COUNTRY就跟随类的加载完成初始化，存在方法区中。且有且仅有一份。
    // 100个对象也只有1份，大大节省了堆空间，防止了OOM
    static final String COUNTRY = "中国";

}
