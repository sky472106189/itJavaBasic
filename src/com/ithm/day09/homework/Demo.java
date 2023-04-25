package com.ithm.day09.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
1. 编写一个标准的 JavaBean类 电车类(Tram)   属性有 : 品牌(String), 价格(int), 已行驶距离(int)
2. 创建 Demo类, 在main方法中创建出三个电车对象, 品牌名和价格自拟
[已行驶距离] 这个属性值 需要随机生成  (随机数需生成3个, 范围0-2000的整数, 包含0和2000)
3. 将创建好的三个电车对象, 存入ArrayList<Tram>中
4. 查找集合中是否存在 [已行驶距离在1000以下的电车]
     存在 : 则将该电车的品牌, 价格, 和行驶距离打印在控制台
     不存在 : 输出 (没有行驶距离在1000以下的电车)
*/
public class Demo {
    public static void main(String[] args) {
        Tram tram1 = new Tram("雷电",3299);
        Tram tram2 = new Tram("三和",2399);
        Tram tram3 = new Tram("闪电",1699);
        tram1.setDistance(new Random().nextInt(2001));
        tram2.setDistance(new Random().nextInt(2001));
        tram3.setDistance(new Random().nextInt(2001));

        List<Tram> list = new ArrayList<>();
        list.add(tram1);
        list.add(tram2);
        list.add(tram3);

        Boolean flag = false;
        for (Tram obj : list) {
            if(obj.getDistance()>1000){
                flag = true;
                System.out.println(obj);
            }
        }
        if(!flag){
            System.out.println("没有行驶距离在1000以下的电车");
        }
    }
}
