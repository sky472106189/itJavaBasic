package com.itpw.day14.io.file_5;


import java.io.File;

/**
 * 目标：掌握File提供的遍历文件夹的方法。
 */
public class FileDemo03 {
    public static void main(String[] args) {
        File file = new File("day08\\src\\com\\itheima");
        // 1、public String[] list()：获取当前目录下所有的"一级文件名称"到一个字符串数组中去返回。
        String[] strings = file.list();
        if (strings != null) { // 非空判断，避免空指针异常
            for (String name : strings) {
                System.out.println(name);
            }
        }
        System.out.println("-------------------------");

        // 2、public File[] listFiles():（重点）获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回（重点）
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                System.out.println(f.getAbsolutePath());
            }
        }
    }
}
