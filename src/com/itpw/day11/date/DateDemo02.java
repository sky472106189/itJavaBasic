package com.itpw.day11.date;

/*
    获取自1970年1月1日 00:00:00 000到当前系统时间的毫秒数
*/
public class DateDemo02 {
    public static void main(String[] args) {
        //统计方法耗时
        long before = System.currentTimeMillis();
        print();
        long after =  System.currentTimeMillis();
        System.out.println("耗费时长："+(after-before)+"毫秒");
    }

    public static void print(){
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            // System.out.println(i);
        }
    }
}
