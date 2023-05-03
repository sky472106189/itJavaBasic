package com.itpw.day10.stringbuffer;

/*
* 具体原因要点金源码查看
* */
public class StringBufferInterview03 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);

        System.out.println(sb.length());
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);
    }
}
