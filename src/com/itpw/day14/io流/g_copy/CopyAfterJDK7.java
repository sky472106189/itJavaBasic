package com.itpw.day14.io流.g_copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    JDK7之后的语法糖：
        try(资源对象1; 资源对象2;){
            使用资源的代码
        }catch(异常类 e){
            处理异常的代码
        }
    减少了代码的繁杂，能自动释放try括号中的资源

    此语法糖基于AutoCloseable接口，范式继承此类或间接继承的都能放入try()括号中，并且自动关闭
    此例中的结构:FileInputStream -> InputStream -> Closeable -> AutoCloseable
                FileOutputStream -> OutputStream -> Closeable -> AutoCloseable
*/
public class CopyAfterJDK7 {
    public static void main(String[] args) {
        try (
            FileInputStream fis  = new FileInputStream("README.MD");
            FileOutputStream fos = new FileOutputStream("src/com/itpw/day14/io流/resource/copyFile");
        ){
            int readCount = 0;
            byte[] b = new byte[10];
            // 边读边写
            while((readCount = fis.read(b))!=-1){
                fos.write(b,0,readCount);
            }
            // 不会自动刷新
            fos.flush();
            // 会自动关闭
            // fos.close();
            // fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 此语法糖支持finally
            System.out.println("finally执行");
        }
    }
}
