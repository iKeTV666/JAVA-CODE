package com.it.hw1;

public class square extends shape {
    private double length;
    private double width;
    public square() {
    }
    public square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void getArea() {
        System.out.println("长方形的面积为：" + length * width);
    }

    @Override
    public void getLong() {
        System.out.println("长方形的周长为：" + 2 * (length + width));
    }
}
