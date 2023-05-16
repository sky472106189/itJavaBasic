package com.itpw.day14.io流.a_文件专属_掌握_1.字节流.fos_2;

import java.io.FileOutputStream;

/*
   字节输出流实现换行
      0、直接write'\n'
      1、写入换行 windows
        fos.write("\r\n".getBytes());
      2、linux   高版本的windows兼容了mac和linux的回车换行
        fos.write("\n".getBytes());
*/
public class FileOutputStreamDemo02 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("src/com/itpw/day14io流resource/myFile");
        String str = "我是中国人";
        byte[] bytes = str.getBytes();
        fos.write(bytes);

        // 直接法
        fos.write('\n');
        // (部分老项目)win7对换行的书写要求\r\n,支持linux和max
        fos.write("\r\n".getBytes());
        // 新版本win的书写\n，支持linux和max
        fos.write("\n".getBytes());
    }
}
