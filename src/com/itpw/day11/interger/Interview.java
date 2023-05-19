package com.itpw.day11.interger;

/*
包装类的缓存机制
    Byte,Short,Integer,Long 这 4 种包装类默认创建了数值 [-128，127] 的相应类型的缓存数据
    Character 创建了数值在 [0,127] 范围的缓存数据

    两种浮点数类型的包装类 Float,Double 并没有实现缓存机制。
*/
public class Interview {

    public static void main(String[] args) {
        Integer i1 = 33;
        Integer i2 = 33;
        System.out.println(i1 == i2);// 输出 true

        Float f1 = 333f;
        Float f2 = 333f;
        System.out.println(f1 == f2);// 输出 false

        Double i3 = 1.2;
        Double i4 = 1.2;
        System.out.println(i3 == i4);// 输出 false

        Integer t1 = 40;
        Integer t2 = new Integer(40);
        System.out.println(t1==t2);// 输出什么？

        // 如果频繁拆装箱的话，也会严重影响系统的性能。我们应该尽量避免不必要的拆装箱操作。
        long before = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            func1(i+129);
        }
        long after = System.currentTimeMillis();
        System.out.println("自动装箱耗时"+(after-before));
        before = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            func2(i+129);
        }
        after = System.currentTimeMillis();
        System.out.println("无装箱耗时"+(after-before));
    }

    // 形参是包装类,传入的int会自动装箱
    public static void func1(Integer o){
        o++;
    }

    // 形参是基本类型,不会自动装箱
    public static void func2(int o){
        o++;
    }
}
