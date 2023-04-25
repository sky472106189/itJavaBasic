package com.ithm.demo;

/*
* - 在JDK1.6及之前,字符串常量池存放在方法区中。到JDK1.7之后,就从方法区中移除了,而存放在堆中
* -
* 正确理解和使用JAVA中的字符串常量池
* 摘自https://blog.csdn.net/BASK2311/article/details/128455119
* 摘自https://blog.csdn.net/weixin_53170971/article/details/127215939
* 摘自https://blog.csdn.net/qq_27093465/article/details/106767042
* */
public class StringDemo04 {
    public static void main(String[] args) {
        //使用 == 运算符比较两个引用时,它会比较内存中的地址。
        String s = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println(s == s2);  // true
        System.out.println(s == s3);  // false
        System.out.println(s2 == s3); // false

        String str1 = "abc";
        String str2 = "ab";
        String str3 = str2 + "c";
        System.out.println(str1 == str3); // false

        String st1 = "abc";
        String st2 = "a" + "b" + "c";
        System.out.println(st1 == st2); // true
    }

    // 常量与常量的拼接结果在常量池，原理是编译期优化。
    public static void test0() {
        // 都是常量，前端编译期会进行代码优化
        // 通过idea直接看对应的反编译的class文件，会显示 String s1 = "abc"; 说明做了代码优化
        String s1 = "a" + "b" + "c";
        String s2 = "abc";

        // true，有上述可知，s1和s2实际上指向字符串常量池中的同一个值
        System.out.println(s1 == s2);
    }

    //只要其中有一个是变量，结果就在堆中, 变量拼接的底层原理其实是StringBuilder。
    public static void test1() {
        String s1 = "javaEE";
        String s2 = "hadoop";
        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;
        // true 编译期优化
        System.out.println(s3 == s4);
        // false s1是变量，不能编译期优化
        System.out.println(s3 == s5);
        // false s2是变量，不能编译期优化
        System.out.println(s3 == s6);
        // false s1、s2都是变量
        System.out.println(s3 == s7);
        // false s5、s6 不同的对象实例
        System.out.println(s5 == s6);
        // false s5、s7 不同的对象实例
        System.out.println(s5 == s7);
        // false s6、s7 不同的对象实例
        System.out.println(s6 == s7);
    }

   // 不使用final修饰，即为变量。如s3行的s1和s2，会通过new StringBuilder进行拼接
   // 使用final修饰，即为常量。会在编译器进行代码优化。
   public void test2() {
       String s0 = "beijing";
       String s1 = "bei";
       String s2 = "jing";
       String s3 = s1 + s2;
       // false s3指向对象实例，s0指向字符串常量池中的"beijing"
       System.out.println(s0 == s3);

       String s7 = "shanxi";
       final String s4 = "shan";
       final String s5 = "xi";
       String s6 = s4 + s5;
       // true s4和s5是final修饰的，编译期就能确定s6的值了
       System.out.println(s6 == s7);
   }
}
