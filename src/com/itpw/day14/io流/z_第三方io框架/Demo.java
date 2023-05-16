package com.itpw.day14.io流.z_第三方io框架;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Demo {
    public static void main(String[] args) throws IOException {
        // commons-io提供工具类演示
        commonsIO();

        // jdk原生提供的工具类演示
        jdkFiles();
    }

    /**
     * jdk原生的IO工具
     * java.nio包下的Files
     * @throws IOException
     */
    public static void jdkFiles() throws IOException{
        // 1.复制文件
        // public static Path copy(Path source, Path target, CopyOption... options) 复制文件
        // public static Path of(String first)  使用指定文件路径创建一个路径对象
        Files.copy(Path.of("src\\com\\itpw\\day14\\io流\\io笔记.txt"),Path.of("src\\com\\itpw\\day14\\io流\\io笔记副本.txt"));

        // 2.读整个文件
        // public static String readString(Path path, Charset cs) 使用指定的字符集读取文本文件中全部内容
        Files.readString(Path.of("src\\com\\itpw\\day14\\io流\\io笔记.txt"), StandardCharsets.UTF_8);
        // String str = Files.readString(Path.of("src\com\itpw\day14\io流\io笔记.txt"), Charset.forName("GBK"));
    }

    /**
     * 第三方IO框架
     * @throws IOException
     */
    public static void commonsIO() throws IOException {
        // 1.复制文件
        FileUtils.copyFile(new File("src\\com\\itpw\\day14\\io流\\io笔记.txt"),new File("src\\com\\itpw\\day14\\io流\\io笔记副本.txt"));

        // 1. 复制文件
        // public static void copyFile(File srcFile, File destFile) 复制文件
        FileUtils.copyFile(new File("src\\com\\itpw\\day14\\io流\\io笔记.txt"), new File("src\\com\\itpw\\day14\\io流\\io笔记副本.txt"));
        long end = System.currentTimeMillis();

        // 2. 复制文件夹
        // public static void copyDirectory(File srcDir, File destDir) 复习文件夹
        // FileUtils.copyDirectory(new File("D:\\file\\java74"),new File("D:\\file\\java74x"));

        // 3. 删除文件夹
        // public static void deleteDirectory(File directory) 删除整个文件夹
        // FileUtils.deleteDirectory(new File("D:\\file\\java74x"));

        // 4. 把文件内容按照指定编码读取为字符串
        // public static String readFileToString(File file, String charsetName) 把文件内容按照指定编码读取为字符串
        String strInTxt = FileUtils.readFileToString(new File("src\\com\\itpw\\day14\\io流\\io笔记.txt"), "utf-8");
        System.out.println("strInTxt = " + strInTxt);

        // 5. 把字符串按照指定编码写入文件，指定是否追加写入
        // public static void writeStringToFile(File file, String data, String charsetName, boolean append) 把字符串按照指定编码写入文件，指定是否追加写入
        FileUtils.writeStringToFile(new File("src\\com\\itpw\\day14\\io流\\io笔记.txt"),"写成功了吗？","utf-8",true);
    }
}
