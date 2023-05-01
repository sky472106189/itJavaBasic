package com.itpw.day09.array;

/*
 1、main方法中的String[] args有什么用
     JVM调用main方法时，会自动传一个String数组过来
*/
public class ArrayDemo03 {
    public static void main(String[] args) {
        // args的默认长度=0
        System.out.println("args的默认长度="+args.length);

        // args数组是留给用户的，用户可以在控制台上输入参数，这个参数自动被转换为“String[] args”
        // 例如：java ArrayDemo03 abc def xyz
        // 那么JVM会自动将“abc def xyz”通过空格方式进行分离，放入String数组
        // {"abc","def","xyz"}
        // Run-Edit Configurations-Build and Run
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
