package com.fangfa.demo;

public class demo2 {
    public static void main(String[] args) {
        method1(10,20);
    }


    public static void method1(int length,int width){
        int result = length * 2 + width * 2;
        System.out.println("矩形的周长为：" + result);
    }
}
