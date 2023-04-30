package com.ithmbasic.day05;

public class MethodDemo02 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,6};
        int res = func(array);
        System.out.println(res);

        printMaxAndMin(array);

        countFiveAndThree();
    }

    /**
     * 求数组元素之和
     * @param array 数组
     * @return  数组和
     */
    public static int func(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return  sum;
    }

    /**
     * 打印int数组中最大值和最小值
     * @param array 数组
     */
    public static void printMaxAndMin(int[] array){
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max<array[i]) max = array[i];
            if(min>array[i]) min = array[i];
        }
        System.out.println("最大值="+max);
        System.out.println("最小值="+min);

    }

    /**
     * 统计1~100内3倍数个数和5的倍数的个数
     */
    public static void countFiveAndThree(){
        int count3 = 0; //3倍数个数
        int count5 = 0; //5倍数个数
        for (int i = 1; i <= 100; i++) {
            if(i%3==0){
                count3++;
            }
            if(i%5==0){
                count5++;
            }
        }
        System.out.println("3倍数的个数="+count3);
        System.out.println("5倍数的个数="+count5);

    }
}
