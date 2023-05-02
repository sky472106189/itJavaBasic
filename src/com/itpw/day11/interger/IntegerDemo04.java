package com.itpw.day11.interger;

/*
    Integer常用方法(且总结一些经典异常)
*/
public class IntegerDemo04 {
    public static void main(String[] args) {
        // 手动装箱方式一 1.9后已过时
        Integer x = new Integer(100);

        // 手动装箱方式一
        int y = Integer.valueOf(100);

        // 编译通过，但是运行报错
        // java.lang.NumberFormatException(数字格式异常)
//        Integer a  = new Integer("中国");

        // (常用)静态方法 parseInt(String s);字符串转int
        int i = Integer.parseInt("123");
        System.out.println(i+100);

        /*
        * 总结下经典运行异常
        *   空指针异常:NullPointException
        *   类型转换异常:ClassCastException
        *   数组下标越界异常:IndexOutOfBoundsException
        *   数字格式化异常:NumberFormatException
        * */

        /*---------------------了解---------------------------*/
        // int十进制转二进制（补码） 不会超过4B大小
        String s = Integer.toBinaryString(127);
        String s1 = Integer.toBinaryString(-1);
//        String min = Integer.toBinaryString(Integer.MIN_VALUE);
//        String outMin = Integer.toBinaryString(Integer.MIN_VALUE-1);
        System.out.println(s);// 111,1111
        System.out.println(s1);// 1111,1111,1111,1111,1111,1111,1111,1111
//        System.out.println(min);//    10000000000000000000000000000000
//        System.out.println(outMin);// 01111111111111111111111111111111


    }
}
