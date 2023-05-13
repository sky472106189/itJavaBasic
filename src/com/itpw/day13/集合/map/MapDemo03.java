package com.itpw.day13.集合.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 统计80个学生对四个景区的投票人数
 */
public class MapDemo03 {
    public static void main(String[] args) {
        Map<String, Integer> viewCount = new HashMap<>();
        for (int i = 0; i < 80; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    addView(viewCount,"西湖");
                    break;
                case 1:
                    addView(viewCount, "雷峰塔");
                    break;
                case 2:
                    addView(viewCount, "云溪竹径");
                    break;
                case 3:
                    addView(viewCount, "杭州黑马");
                    break;
                default:
            }
        }
        viewCount.forEach((k,v)-> System.out.println(k+"="+v));
    }

    public static void addView(Map<String, Integer> map, String viewName) {
        if (!map.containsKey(viewName)) {
            map.put(viewName, 1);
        } else {
            map.put(viewName, map.get(viewName) + 1);
        }
    }

}
