package com.itpw.day13.lambda;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

/*
 调用自定义的函数式接口
 */
public class LambdaDemo02 {
    public static void main(String[] args) {
        Provice p1 = new Provice() {
            @Override
            public String whichProvice(String name) {
                return name + "是浙江省的";
            }
        };
        p1.whichProvice("娃哈哈");

        Provice p2 = (String name) -> {
            return name + "是妈妈生的";
        };
        p2.whichProvice("顶真");

        Provice p3 = (name) -> name + "是湖南省的";
        p3.whichProvice("三毛烧烤");

        //对数组的省略
        double[] doubles = new double[]{1.0, 2.1, 3.1, 0.9, 6, 9};
        Arrays.setAll(doubles, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return doubles[value] * 8;
            }
        });

        Arrays.setAll(doubles, (int value) -> {
            return doubles[value] * 8;
        });

        Arrays.setAll(doubles, (value) -> {
            return doubles[value] * 8;
        });

        Arrays.setAll(doubles, (value) -> doubles[value] * 8);
    }
}
