package com.it.day02;

/**
 * 类型转换
 */
public class TypeCast {
    public static void main(String[] args) {
        int a = 10;
        long b = a;
        System.out.println(b); // b = 10 正常无误;

        /*
         * char,byte类型的变量的在参与运算的时候，会自动提升为int类型
         * 故byte res1 = b1 + b2 编译不通过 因为b1+b1 自动类型转换为int了
         * */
        byte b1 = 10;
        byte b2 = 20;
        //byte res1 = b1 + b2; //编译不通过，编译器不知道加法结果,只知道是int类型
        byte res1 = (byte) (b1 + b2); //通过
        //int res1 = b1 + b2; //通过res1 = 30
        System.out.println("res1=" + res1);

        /*
         * 分析:
         * (原码)..32个0,1000,0000,0000,0000,0000,0000,0000,0001B = 2147483649D
         * 解析long符号是正数，那么符号位不需要变，补码等于原码
         * (补码)..32个0,1000,0000,0000,0000,0000,0000,0000,0001B
         * 强制转换为int时，会直接截断低32位，得到结果如下:
         *   注意:补码截断直接是补码,不需要再转换
         * (补码)1000,0000,0000,0000,0000,0000,0000,0001
         * (原码)1111 1111 1111 1111 1111 1111 1111 1111B = -2147483647D
         * */
        //long有8B，共64bit. c = ...32个0,1000,0000,0000,0000,0000,0000,0000,0001B
        long c = 2147483649L;
        int d = (int) c;    // c  = -2147483647 结果变了且符号也变了
        System.out.println(d);

        /*
         * 4294967296L =(原码) ...31位0,0001,0000,0000,0000,0000,0000,0000,0000,0000B
         * 补码同样 =  ...31位0,0001,0000,0000,0000,0000,0000,0000,0000,0000B
         * int 截断 低32位 = 0000,0000,0000,0000,0000,0000,0000,0000B
         * */
        long a1 = 4294967296L;
        int d1 = (int) a1;
        System.out.println(d1);//d1 = 0;
    }
}
