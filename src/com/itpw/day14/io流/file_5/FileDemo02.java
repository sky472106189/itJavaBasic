package com.itpw.day14.io流.file_5;

import java.io.File;
import java.io.IOException;

/*
    掌握File创建和删除文件相关的方法
 */
public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        // 1、public boolean createNewFile():创建一个新文件（文件内容为空），创建成功返回true
        File file1 = new File
                ("C:\\Users\\15173\\IdeaProjects\\itJavaBasic\\src\\com\\itpw\\day14\\io流\\createNewFile.txt");
        System.out.println(file1.createNewFile());
        // 2、public boolean mkdir():用于创建文件夹，注意:只能创建一级文件夹
        File file2 = new File
                ("C:\\Users\\15173\\IdeaProjects\\itJavaBasic\\src\\com\\itpw\\day14\\io流\\mkNewDir");
        System.out.println(file2.mkdir());
        // 3、public boolean mkdirs():用于创建文件夹，注意:可以创建多级文件夹
        File file3 = new File
                ("C:\\Users\\15173\\IdeaProjects\\itJavaBasic\\src\\com\\itpw\\day14\\io流\\mkNewDir133\\mkNewDir2");
        System.out.println(file3.mkdirs());
        // 4、public boolean delete():删除文件，注意：不能删除非空文件夹
        System.out.println(file3.delete());
    }
}
