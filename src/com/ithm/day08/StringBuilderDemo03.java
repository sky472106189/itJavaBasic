package com.ithm.day08;


import java.util.Scanner;

public class StringBuilderDemo03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("首先执行手机号中间四位屏蔽方法");
//        String str = sc.next();
//        System.out.println(StringBuilderDemo03.func(str));

        System.out.println("执行屏蔽TMD方法");
//        String str1 = sc.next();
        System.out.println(StringBuilderDemo03.delTmd("TTMDD"));
    }

    /***
     * 手机号中间四位屏蔽
     * @param phoneNumber 手机号
     * @return 屏蔽后的手机号
     */
    public static String func(String phoneNumber) {
        char[] chars = phoneNumber.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i >= 3 && i <= 6) {
                chars[i] = '*';
            }
        }
        return new String(chars);
    }

    /***
     * 删除字符串中的TMD
     * @param input 输入值
     * @return
     */
    public static String delTmd(String input) {
        // 方法一 直接调用api方法
         return (input.replace("TMD","***"));

        // 方法二 朴素算法
        // 或者最佳实现可以参考KMP算法(待补充2023.4.25

    }

}


