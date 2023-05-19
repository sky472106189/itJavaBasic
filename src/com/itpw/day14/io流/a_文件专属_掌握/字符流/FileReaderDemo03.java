package com.itpw.day14.io流.a_文件专属_掌握.字符流;

import java.io.*;
import java.nio.charset.StandardCharsets;

/*
  为什么不能用字符流按照ASCII标准1B的读法，模仿字节流去复制图片呢？
  我的解释:字符流必须按照一个指定的字符集，去解析该文件
  比如按照UTF-8，读"我a你",读到我，那么根据二进制首几位数字,判断是中文字符，就解析3B，
  然年后读到a的首数字，用ASCII标准，接着循环。

  但是如果是图片，图片的二进制是没有标准的，它就是一连串二进制，需要交给操作系统
  来拼接。
  字符流边读边解析，是按指定字符集标准下的二进制串。
  而字节流1B的读，是没有规则的，是拼接完成后，交给操作系统解析的。

  试想一下:我们读文件，文件事先在硬盘中存在了，而存在的文件，比如文本，或者图片，都是
  按照操作系统的规则去编写完成，存进了操作系统硬盘中。我们读的是经过操作系统处理后的文件。
  实质上就是一个操作系统能识别的二进制串。
  例如：
        我们新建了一个 hello.jpg 假设操作系统认定此图片的二进制串是1001。存入了硬盘，
  那么打开时会按照操作系统的标准解析，读到此hello.jpg图片时，字节流读的也是1001
        如果用字符流读，默认按照一套字符集，边读边解析，那么二进制串就变陌生了->1110，操作
  系统就解析不懂了
*/
public class FileReaderDemo03 {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("src\\com\\itpw\\day14\\io流\\什么是IO.jpg", StandardCharsets.US_ASCII);
            FileWriter fw = new FileWriter("src\\com\\itpw\\day14\\io流\\什么是IO123.jpg", StandardCharsets.US_ASCII);
            ) {
            int len;
            while((len = fr.read())!=-1){
                fw.write(len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
