package com.itpw.day14.io.数据流_3;

import java.io.DataInputStream;
import java.io.FileInputStream;

/*
    DataInputStream:
        数据字节输入流
        DataOutputStream写的文件，只能使用此流去读，且读的顺序要和写的顺序一致。才能正常取出
*/
public class DataInputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        DataInputStream dis = new DataInputStream(
                new FileInputStream("src/com/itpw/day14/io/resource/data"));
        byte b = dis.readByte();
        short s = dis.readShort();
        int i = dis.readInt();
        long l = dis.readLong();
        float f = dis.readFloat();
        double d = dis.readDouble();
        boolean flag = dis.readBoolean();
        char c = dis.readChar();

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(flag);
        System.out.println(c);

        dis.close();
    }
}
