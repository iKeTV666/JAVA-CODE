package com.it.hw1;

public class round extends shape {
    private double radius;
    public round() {
    }
    public round(double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println("圆的面积为：" + Math.PI * radius * radius);
    }

    @Override
    public void getLong() {
        System.out.println("圆的周长为：" + 2 * Math.PI * radius);
    }
}
