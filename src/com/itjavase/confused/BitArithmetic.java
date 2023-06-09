package com.itjavase.confused;

/*
    位运算
     关于二进制补码加减法，加法直接做加就好
     减法:6-3，把3的补码写出来，然后全部位(包括符号位)取反末位+1，得到(-3)补，式子化为 6+(-3)补，减法变加法。

    能得对应二进制
    Integer.toBinaryString(int k);
    Double.toHexString(double d);
    Float.toHexString(float f)
*/
public class BitArithmetic {
    public static void main(String[] args) {
        System.out.println("位移运算");
        int i = 3;
        // 0011 左移2位 1100 = 8+4 = 12
        System.out.println(i<<2);


        int k = -1;
        System.out.println("-1对应二进制补码:"+Integer.toBinaryString(k));
        //          1000,0000,0000,0000,0000,0000,0000,0001 (原码) = -1
        //          1111,1111,1111,1111,1111,1111,1111,1111 (补码)
        // k<<1     1111,1111,1111,1111,1111,1111,1111,1110 (补码) 算术移位
        //          1000,0000,0000,0000,0000,0000,0000,0010 (原码) = -2
        // k>>1     1111,1111,1111,1111,1111,1111,1111,1111 (补码) 算术移位
        //          1000,0000,0000,0000,0000,0000,0000,0001 (原码) = -1
        System.out.println(k<<1);   //-2
        System.out.println(k>>1);   //-1

        System.out.println("————————异或运算——————————");
        int m1 = 3;
        int m2 = 4;
        // ^ 异或 同0异1
        // 3 = 0011
        // 4 = 0100
        //   = 0111 = 7
        System.out.println(m1^m2);

        int n1 = -3;
        int n2 = 4;
        // ^ 异或 同0异1
        // -3 = 1000,0000,0000,0000,0000,0000,0000,0011(原码)
        // 4  = 0000,0000,0000,0000,0000,0000,0000,0100(原码)
        //    = 1000,0000,0000,0000,0000,0000,0000,0111(原码) = -7
        // 可以直接对化成原码再操作
        System.out.println(n1^n2);

        int a1 = 0b0001;// 二进制格式 a1 = 1
        int a2 = 0b1000;// 二进制格式 a1 = 8
        // 两个真才为真,否则为0
        // 0001 & 1000 = 0000
        System.out.println(a1&a2);

        int i1 = 9;  //1001
        int k1 = 10; //1010
        //  1001
        // &1010
        //  1000
        int res1 = i1&k1; // res = 8
        System.out.println(res1);

        // 一个真就为真
        // 0001 | 1000 = 1001
        System.out.println(a1|a2);

    }
}
