package com.ithmbasic.day09.homework;

// 电车类
public class Tram {
    // 品牌名
    private String brand;
    // 价格
    private int price;
    // 行驶距离
    private int distance;

    public Tram() {
    }

    public Tram(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public Tram(String brand, int price, int distance) {
        this.brand = brand;
        this.price = price;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Tram{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", distance=" + distance +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
