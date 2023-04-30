package com.ithmbasic.day03;

/**
 * break 和 continue
 * */
public class BreakContinueDemo {
    public static void main(String[] args) {
        //break只能跳出一层循环
        for (int i = 0; i < 10; i++) {
            System.out.println("第"+i+"次循环");
            for (int j = 0; j < 10; j++) {
                if(j==2) break;
                System.out.println("j="+j);
            }
        }
    }
}
