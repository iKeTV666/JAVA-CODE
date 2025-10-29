package com.fangfa.demo;

public class HW2 {
    public static void main(String[] args) {
        int max = findMax(1,2,3);
        System.out.println(max);
    }



    public static int findMax(int a,int b,int c){
        if (a > b && a > c){
            return a;
        }else if (b > a && b > c){
            return b;
        }else {
            return c;
        }
    }
}
