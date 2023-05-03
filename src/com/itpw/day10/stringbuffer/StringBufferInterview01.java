package com.itpw.day10.stringbuffer;

public class StringBufferInterview01 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        oprate(a,b);
        System.out.println(a+","+b);
    }
    public static void oprate(StringBuffer x,StringBuffer y){
        x.append(y);
        y = x;
        y.append(x);
    }
}
