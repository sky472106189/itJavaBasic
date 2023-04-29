package com.itpw.day05.多态.unit3疑惑;

/*
    B1继承A，B2继承A，B1和B2无关系
*/
public class Demo {
    public static void main(String[] args) {
        A a = new B1();

        // JVM实际操作的是堆中B1对象
        // 又因为B1和B2无继承关系，所以a不能向下转型为B2;
        System.out.println(a instanceof B2); // false
        // 但是你对传入的对象位置，你不知道是B1还是B2，你就要用这个方法来确定了
        // 未来编程都是多态的。比如String源码中重写equals(Object obj)方法
        // 有这个一个判断if (anObject instanceof String)
        // 就是为了确保传入的anObject能否向下转型成String

        // 疑惑点： A a = new B1();
        // 解答：A a存在栈中有个地址值0x123，指向了堆中的B1对象
        A a1 = new A();
        B2 b = (B2)a1;// 报错ClassCastException
        // 分析上错原因：
        // a1无论在堆还是在栈中都是A类，而父亲A向下转型为子类B2是不允许的。

        // 总之:看准new 后面的是谁，那么就实际操作的谁。堆中存放的就是谁。
        // 如果编写的方法形参是父类，那么向下转型为任一子类时，先instanceof一下
    }
}

class A {

}

class B1 extends A {
}

class B2 extends A {
}

