package com.itjavase.demo;

// 二分查找
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 23, 79, 81, 103, 131, 147};
        System.out.println(BinaryFind(arr, 103));
    }

    /***
     * 二分查找
     * @param array
     * @param target
     * @return
     */
    public static int BinaryFind(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if(target == array[mid]){
                return mid;
            }
            else if (target < array[mid]) {
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
