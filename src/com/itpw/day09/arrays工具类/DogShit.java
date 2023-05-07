package com.itpw.day09.arrays工具类;

/*
Comparator底层实现原理
    别深究，看的头疼也没搞懂。以后工作遇到就用测试类确定
    https://blog.csdn.net/u013066244/article/details/78997869
    https://blog.csdn.net/Saintmm/article/details/125218837
*/
class DogShit implements Comparable<DogShit> {
    private String name;
    private int weight;
    private int temperature;

    @Override
    public int compareTo(DogShit o) {
/*        if(this.weight > o.weight){
            return 1;
        }else if(this.weight < o.weight){
            return -1;
        }
        return 0;*/
        return this.weight - o.weight;
    }

    public DogShit() {
    }

    public DogShit(String name, int weight, int temperature) {
        this.name = name;
        this.weight = weight;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "DogShit{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", temperature=" + temperature +
                '}';
    }

}
