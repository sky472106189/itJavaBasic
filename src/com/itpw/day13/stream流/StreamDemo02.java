package com.itpw.day13.stream流;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
    创建Stream流
        注意:单列集合才有Stream流。双列集合需要转成单列才能使用Stream，
        比如Map将k,v转换成Set才能获取Stream流
*/
public class StreamDemo02 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        Collections.addAll(nameList,"小明","小张","哆啦A梦","小小酥");
        Set<String> nameSet = new HashSet<>();
        Collections.addAll(nameSet,"小明","小张","哆啦A梦","小小酥");
        Map<Integer,String> map = new HashMap<>();

        // 1、获取List集合的Steam流
        Stream<String> listStream = nameList.stream();

        // 2、获取Set集合的Stream流
        Stream<String> setStream = nameSet.stream();

        // 3、获取Map集合的Steam流
        // map.stream();//错误
        Set<Integer> keySet = map.keySet();
        Stream<Integer> keyStream = keySet.stream();

        Collection<String> values = map.values();
        Stream<String> valuesStream = values.stream();

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Stream<Map.Entry<Integer, String>> entryStream = entries.stream();

        // 4、获取数组的Stream流
        int[] arr = new int[]{1,2,3,4,5,0};
            //4.1 Arrays.stream()
        IntStream intStream1 = Arrays.stream(arr);
            //4.2 Stream.of()
        Stream<int[]> intStream2 = Stream.of(arr);
    }
}
