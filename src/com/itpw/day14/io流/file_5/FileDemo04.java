package com.itpw.day14.io流.file_5;

import java.io.File;

/**
 * 目标：掌握文件搜索的实现。
 */
public class FileDemo04 {

    public static void main(String[] args) {
        // 制定一个目录，查看目录下是否有某个文件
        searchFile(new File
                ("C:\\Users\\15173\\IdeaProjects\\itJavaBasic\\src\\com\\itpw\\day14\\io流\\resource"),
                "temp.txt");
    }

    public static void searchFile(File dir, String fileName) {
        // 目录为null或者不存在或者是文件，跳出递归(return)
        if (dir == null || !dir.exists() || dir.isFile()) {
            return;
        }

        // 获取目录下所有文件
        File[] files = dir.listFiles();
        // 非空判断
        if (files != null) {
            for (File file : files) {
                // 判断遍历的文件是文件夹还是文件
                if (file.isFile()) {
                    // 如果符合条件，打印相关信息
                    if (file.getName().equals(fileName)) {
                        System.out.println("找到了：" + fileName);
                    }
                } else {
                    // 是文件夹，继承重复这个过程
                    searchFile(file, fileName);
                }
            }
        }
    }
}










