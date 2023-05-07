package com.itpw.day10.facework;

/*
* 设计一个方法，用于返回任意整数数组的内容，要求返回的数组内容格式如：[11,22,33]
* */
public class Test {

    public static void main(String[] args) {
        String res = func(new int[]{11, 22, 33});
        System.out.println(res);
    }

    /***
     * 将数据返回前端指定格式
     * @param array
     * @return
     */
    public static String func(int[] array){
        if(array==null){
            return null;
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            sb.append(",");
        }
        // 将最后一个逗号替换掉
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }
}
