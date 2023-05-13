package com.itpw.day09.array;

/*
 关于一位数组的扩容 System.arraycopy(五个形参)
  数组长度不可变，一旦满了，就需要扩容
      java底层操作方式：
          先新建一个大数组，然后将小容量数组的数据全部拷贝至大数组中，时间复杂度O(n)
 */
public class ArrayDemo05 {
    public static void main(String[] args) {
        // java中数组的拷贝
        // native修饰，调用的是C++方法
        /*
        public static native void arraycopy(Object src,  int  srcPos,
                                                Object dest, int destPos,
                                                int length);*/

        //拷贝源(从这个数组中拷贝)
        int[] src  = {1,11,22,3,4};
        //拷贝目标（拷贝至此处)
        int[] dest = new int[10];

        //从src下标为2的地方开始，拷贝至dest数组，从dest下标为0的开始，拷贝3个
        System.arraycopy(src,2,dest,0,3);

        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }

        // 对引用数组的拷贝
        String[] strs = {"hello","world","java","c++","python"};
        String[] newStrs = new String[10];
        System.arraycopy(strs,0,newStrs,0,strs.length);
        for (int i = 0; i < newStrs.length; i++) {
            System.out.println(newStrs[i]);
        }


    }
}
