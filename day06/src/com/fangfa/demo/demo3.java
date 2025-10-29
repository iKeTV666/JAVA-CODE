package com.fangfa.demo;

public class demo3 {
    public static void main(String[] args) {
        int result = method1(1,2,3,4);
        System.out.println(result);
    }


    public static int method1(int a,int b,int c,int d){
        int result = a + b + c + d;
        return result;
    }
}
