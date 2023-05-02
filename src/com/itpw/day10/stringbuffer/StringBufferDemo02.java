package com.itpw.day10.stringbuffer;

/*
    (于这一块可以再去网上加深一下)
    对于字符串的拼接，最好使用JDK自带的
        java.lang.StringBuffer
        java.lang.StringBuilder
    Q:为什么拼接更好？
    分析：StringBuffer构造方法底层是操作byte[] value。而String构造方法底层是操作private final byte[] value;
    String一旦被赋值，就是final，无法被修改的。而StringBuffer的append可以采用自带的数组拷贝，一旦容量不够就数组拷贝扩容
    而扩容调用正是Arrays.copyOf()方法

    补充：jdk1.8之前，String底层是用char[ ]型数组存储的，直到jdk1.9才改为byte[ ]型数组。

    结论：StringBuffer无参构造初始化了16个元素大小的byte[]数组，一旦追加超过了这个值，底层就会调用Arrays.copyOf()进行数组
    的拷贝扩容。

    Q：如何优化StringBuffer的性能？
       既然超过了初始化容量才会调用底层扩容，那不妨设置一个大小合适的初始化容量。减少底层数组扩容次数
*/
public class StringBufferDemo02 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("a");
        sb.append(true);
        sb.append(100L);
        sb.append(3.14);
        System.out.println(sb);

        // 指定初始化容量大小的StringBuffer对象
        StringBuffer sb1 = new StringBuffer(100);

        // 2023.5.1待解决的问题：这里会报错 OOM
        //java.lang.OutOfMemoryError: Java heap space
/*        while(true){
            sb1.append(1);
        }*/

    }
}
