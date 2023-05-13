package com.itpw.day14.io.缓冲流专属_2;

import com.itpw.day08.访问控制权限.modify01.F;

import java.io.*;

public class BufferedReaderDemo02 {
    public static void main(String[] args) throws Exception {
        // 字节流
        FileInputStream fis = new FileInputStream("README.MD");

        // 字符流缓冲读取只能传字节流，不能传字节流
        // BufferedReader br = new BufferedReader(fis);// 错误
        // 可以使用转换流完成
        InputStreamReader reader = new InputStreamReader(fis);

        BufferedReader br = new BufferedReader(reader);

        // 合并写法
        BufferedReader br1 = new BufferedReader
                (new InputStreamReader(new FileInputStream("README.MD")));

        String line = null;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }

        // 只需关闭包装流
        br.close();
    }
}
