package com.itjavase.confused;

/*
    char字符大小：Java 团队使用 unicode 作为编码，一个 char 作为 2 个字节来存储。
    如果使用 ASCII 编码集，那么 char 占用一个字节，
    如果使用 UTF-8 编码格式呢？UTF-8 是不定长编码，编码的长度是动态的，所以不一定。
*/
public class ByteAndChar {
    public static void main(String[] args) {
        // 1.基本数据类型的互转
        // byte -> char 直接强转(char)
        byte[] bytes = new byte[]{-75, 97, 0, 48, 124};
        for (byte b : bytes) {
            System.out.print("b = " + b);
            System.out.println("\t(char)b = " + (char)b);
        }

        // char -> byte  直接强转(byte)
        // 注意：char能存数字和字符，数学会自动转为对应字符
        //      而byte只能存字符对应的数字
        char[] chars = new char[]{ 97, 0, 48, 124,'a','|','='};
        for (char c : chars) {
            System.out.print("c = " + c);
            System.out.println("(byte)c = " + (byte)c);
        }

        System.out.println("——————————————————————");

        // 2.包装类 引用类型的转换
        // Byte -> Character 引用不能直接强转(char)Byte.byteValue()
        Byte[] bs = new Byte[]{-75, 97, 0, 48, 124};
        for (Byte b : bs) {
            System.out.println("b = " + b);
            System.out.println("(char)b.byteValue() = " + (char)b.byteValue());
        }

        Character[] cs = new Character[]{ 97, 0, 48, 124,'a','|','='};
        for (Character c : cs) {
            System.out.print("c = " + c);
            System.out.println("(byte)c.charValue() = " + (byte) c.charValue());
        }
    }
}
