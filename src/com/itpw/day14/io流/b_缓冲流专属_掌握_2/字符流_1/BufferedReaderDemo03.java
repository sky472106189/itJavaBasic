package com.itpw.day14.io流.b_缓冲流专属_掌握_2.字符流_1;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    需求:使用字符缓冲流读取文件中的数据，排序后写回到相同的本地文件
*/
public class BufferedReaderDemo03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\com\\itpw\\day14\\io流\\test.txt"));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        // 方式1：使用传统的方式将String数组转换成TreeSet树
        // Set<Integer> treeSet = new TreeSet<>();
        // for (String s2 : s1) {
        //     treeSet.add(Integer.parseInt(s2));
        // }

        // 方式2：使用Stream(流式编程)实现转换 ——day13.stream流下能复习
                // 上流 (字符串数组转为流)
        Set<Integer> treeSet = Stream.of(s1)
                // 中间操作 ()
                .map(o1 -> Integer.parseInt(o1))
                // 下流 (流转换为集合)
                .collect(Collectors.toSet());

        // .map的详细用法(展开lambda)
        // Set<Integer> treeSet = Stream.of(s1)
        //         .map(new Function<String, Integer>() {
        //     @Override
        //     public Integer apply(String o1) {
        //         return Integer.parseInt(o1);
        //     }})
        //         .collect(Collectors.toSet());

        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\com\\itpw\\day14\\io流\\test.txt"));
        StringJoiner sj = new StringJoiner(" ");// StringJoiner能自动完成分隔符
        treeSet.forEach(i -> {
            sj.add(String.valueOf(i));
        });
        bw.write(sj.toString());
        bw.flush();
        bw.close();
        br.close();


    }
}
