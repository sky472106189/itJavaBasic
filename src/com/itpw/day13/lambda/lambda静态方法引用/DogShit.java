package com.itpw.day13.lambda.lambda静态方法引用;

class DogShit {
    private String name;
    private int weight;
    private int temperature;

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
