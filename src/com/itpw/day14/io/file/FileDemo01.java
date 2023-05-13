package com.itpw.day14.io.file;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\15173\\IdeaProjects\\itJavaBasic\\src\\com\\itpw\\day14\\io\\什么是IO.jpg");
        // File.separator 会根据不同的系统产生分隔符，比如MAC系统中的分隔符
        File file1 = new File("C:"+File.separator+"Users"+File.separator+"15173\\IdeaProjects\\itJavaBasic\\src\\com\\itpw\\day14\\io\\什么是IO.jpg");

        // 1、public boolean exists():判断当前文件对象,对应的文件路径是否存在
        System.out.println(file.exists());
        // 2、public boolean isFile():判断当前文件指代的对象是否是文件
        System.out.println(file.isFile());
        // 3、public boolean isDirectory():判断当前文件对象指代的是否是文件夹
        System.out.println(file.isDirectory());
        // 4、public String getName():获取文件名，包含后缀
        System.out.println(file.getName());
        // 5、public long length():获取文件的大小，返回字节个数
        System.out.println(file.length());
        // 6、public long lastModified():获取文件的最后修改时间
        System.out.println(file.lastModified());    // 返回时间戳
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String format = sdf.format(file.lastModified());
            System.out.println(format);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 7、public String getPath():获取创建文件对象时,使用的路径
        System.out.println(file.getPath());
        // 8、public String getAbsoluteFile():获取绝对路径
        System.out.println(file.getAbsoluteFile());
    }
}
