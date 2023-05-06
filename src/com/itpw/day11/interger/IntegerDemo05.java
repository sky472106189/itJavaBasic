package com.itpw.day11.interger;

public class IntegerDemo05 {
    public static void main(String[] args) {
        Integer age = 100;

        String s1 = Integer.toString(age);
        String s2 = age+"";
        String s3 = age.toString();
        String s4 = String.valueOf(age);

        //全是false
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s2==s3);
        System.out.println(s2==s4);
        System.out.println(s3==s4);

    }
}
