package com.ithm.day06;

/*
* Debug快捷键学习
*   F7 跳进方法(如果有的话)
*   ★ F8跳转至下一行
*   ★ F9跳转至下一个断点,如果没有下一个断点就是恢复程序
*   Alt+Shift+F7 强制跳进方法,可以进入任何方法,想查看底层源代码可以用这个进入jdk的方法.
*   Alt+ F8 计算表达式的值(执行到当前行时,内存中有的值)
*   Ctrl+First+F8 查看你设置的所有断点
* */
public class DebugDemo {
    public static void main(String[] args) {
        // 数组反转 方法1:空间复杂度O(n) 时间复杂度O(n)
        int a1[] = {1,2,3,4,5};
        int a2[] = new int[a1.length];
        int j = a1.length-1;
        for (int i = 0; i < a1.length; i++) {
            a2[i] = a1[j--];
        }
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i]);
        }

        System.out.println("\n————方法二————");
        // 数组反转 方法2:空间复杂度O(1) 时间复杂度O(n) 【n趋向于无穷时,O(n/2)->O(n)】
        int array[] = {1,2,3,4,5};
        int temp;
        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

        int doublearray[][] = new int[2][2];
        int length = doublearray[0].length;
        int length2 = doublearray.length;

    }
}
