package com.ithm.day08;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringBuilderDemo03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "abc";
        StringBuilder sb = new StringBuilder(str);
        String stt = new String(sb);

//        System.out.println("首先执行手机号中间四位屏蔽方法");
//        String str = sc.next();
//        System.out.println(StringBuilderDemo03.func(str));

//        System.out.println("执行屏蔽TMD方法");
//        String str1 = sc.next();
//        System.out.println(StringBuilderDemo03.delTmd("TTMDD"));

//        Student data = StringBuilderDemo03.getData();
//        System.out.println(data);
        /*
        String str1 = "12ab,java,cd,Server78";
        List<String> resStr = StringBuilderDemo03.func1(str1);
        for (String res : resStr) {
            System.out.println(res);
        }*/

        /*
        String str0 ="13586040001";
        System.out.println(isPhoneNum(str0));*/

        String str9 = "上海自来水来自海上";
        System.out.println(isReverse(str9));
    }

    /***
     * 手机号中间四位屏蔽
     * @param phoneNumber 手机号
     * @return 屏蔽后的手机号
     */
    public static String func(String phoneNumber) {
        char[] chars = phoneNumber.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i >= 3 && i <= 6) {
                chars[i] = '*';
            }
        }
        return new String(chars);
    }

    /***
     * 删除字符串中的TMD
     * @param input 输入值
     * @return
     */
    public static String delTmd(String input) {
        // 方法一 直接调用api方法
        return (input.replace("TMD", "***"));

        // 方法二 朴素算法
        // 或者最佳实现可以参考KMP算法(待补充2023.4.25
    }

    /***
     *  以字符串的形式从键盘录入学生信息，例如：“张三 , 23”     “张三”  "23"
     *  从该字符串中切割出有效数据,封装为Student学生对象
     * @return 学生对象
     */
    public static Student getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请依次输入姓名和年龄，用逗号个号。如:张三，23");
        String date = sc.next();
        String[] split = null;
        if (date.contains("，")) {
            split = date.split("，");
        } else {
            split = date.split(",");
        }
        return new Student(split[0], Integer.parseInt(split[1]));

    }

    /***
     * 遍历字符串，按照'，'分隔
     * 如果字符串没有包含数字，就将字符串中的小写字母转成大写字母并打印字符串
     * @param param
     * @return
     */
    public static List<String> func1(String param) {
        String[] split = null;
        if (param.contains("，")) {
            split = param.split("，");
        } else {
            split = param.split(",");
        }

        boolean flag = false;   // 含有数字则为true 用于跳出多余循环
        for (int i = 0; i < split.length; i++) {
            char[] chars = split[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] >= '0' && chars[j] <= '9') {
                    //含有数字
                    flag = true;
                    break;
                }
            }
            if (flag) {
                // 含有数字 开始小写转大写
                for (int j = 0; j < chars.length; j++) {
                    if (chars[j] >= 'a' && chars[i] <= 'z') {
                        chars[j] -= 32;
                    }
                }
                // 直接chars.toString不行，因为是Object类的toString方法
                // split[i] = chars.toString();
                split[i] = new String(chars);
                flag = false;   // 初始化flag 继续判断下一组数据
            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            list.add(split[i]);
        }
        return list;
    }

    /***
     * 判断输入的手机号是否符合规范
     * @param num
     * @return
     */
    public static String isPhoneNum(String num) {
        if (num.length() == 11) {
            char[] chars = num.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (!(chars[i] >= '0' && chars[i] <= '9')) {
                    return "注册用户失败";
                }
            }
        } else {
            return "注册用户失败";
        }
        ;
        return num.substring(7);
    }

    /***
     * 判断是否对称
     * @param str
     * @return
     */
    public static boolean isReverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (str.equals(new String(sb.reverse()))) {
            return true;
        }
        return false;
    }
}


class Student {
    private String name;
    private int id;

    public Student() {
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}


