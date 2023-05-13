package com.itpw.day14.io.数据流_3;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
    DataOutputStream:
        数据专属流，此流可以将数据和数据类型一并写入文件
        注意：此文件不能是普通文本文档
*/
public class DataOutputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        DataOutputStream dos = new DataOutputStream(
                new FileOutputStream("src/com/itpw/day14/io/resource/data"));
        byte b = 5;
        short s = 10;
        int i = 35;
        long l = 400L;
        float f = 3.0F;
        double d = 3.14;
        boolean flag = true;
        char c ='a';
        // 写
        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(flag);
        dos.writeChar(c);

        // 输出流要刷新且关闭
        dos.flush();
        dos.close();
    }
}
