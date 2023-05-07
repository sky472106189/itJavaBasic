package com.itpw.day13.lambda.lambda静态方法引用;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo03 {
    public static void main(String[] args) {
        DogShit s1 = new DogShit("茶杯犬狗屎", 10, 37);
        DogShit s2 = new DogShit("金毛狗屎", 100, 15);
        DogShit s3 = new DogShit("哈士奇狗屎", 120, -5);
        DogShit[] shits = new DogShit[]{s1, s2, s3};

        Arrays.sort(shits, Comparator.comparingInt(DogShit::getWeight));

        // CompareByDate 是自己写的工具类，类名
        // compareByWeight是工具类中的静态方法名
        Arrays.sort(shits,(o1,o2)->CompareByDate.compareByWeight(o1,o2));

        // 静态方法引用【类名::方法名】
        // 实际上就是用类名调用方法，但是把参数给省略了。
        Arrays.sort(shits,CompareByDate::compareByWeight);
    }
}
