package com.itpw.day11.random;

import java.util.Random;

public class RandomDemo01 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(100);//产生0~99的数
    }
}
