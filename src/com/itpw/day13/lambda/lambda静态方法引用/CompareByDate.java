package com.itpw.day13.lambda.lambda静态方法引用;

public class CompareByDate {

    /***
     * 实现d1和d2大小比较
     * @param d1
     * @param d2
     * @return
     */
    public static int compareByWeight(DogShit d1,DogShit d2){
        return d1.getWeight() - d2.getWeight();
    }
}
