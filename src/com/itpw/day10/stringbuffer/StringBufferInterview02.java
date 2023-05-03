package com.itpw.day10.stringbuffer;

public class StringBufferInterview02 {

    public static void stringReplace(String text){
        text = text.replace('j', 'i');
    }

    public static void bufferReplace(StringBuffer text){
        text.append("C");
        text = new StringBuffer("Hello");
        text.append("World!");
    }

    /*
    * Q:为什么是java不是iava?
    * A:因为String的replace()方法底层返回的是new String()对象
    *   比如传入方法的地址值是0x123,但是执行完replace方法后新的iava赋值给了0x234;
    *   回到main方法栈帧，此时0x123仍指向java，所以返回java
    * */
    public static void main(String[] args) {
        String str = new String("java");
        StringBuffer sb = new StringBuffer("java");
        bufferReplace(sb);
        stringReplace(str);
        System.out.println(str);// java
        System.out.println(sb);// javaC

        sb.setLength(0);
    }
}
