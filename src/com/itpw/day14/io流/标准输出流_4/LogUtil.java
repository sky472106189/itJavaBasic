package com.itpw.day14.io流.标准输出流_4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 日志框架简单实现
* */
public class LogUtil {
    public static void main(String[] args) {
        LogUtil.log("发生错误啦");
        LogUtil.log("NOP");
        LogUtil.log("OOM");
        LogUtil.log("ClassCastException");
    }

    public static void log(String msg){
        try{
            PrintStream printStream = new PrintStream(
                    new FileOutputStream("src\\com\\itpw\\day14\\io流\\resource\\log.txt",true));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            Date date = new Date(System.currentTimeMillis()) ;
            String exceptionTime = sdf.format(date);
            printStream.println(exceptionTime+"："+msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
