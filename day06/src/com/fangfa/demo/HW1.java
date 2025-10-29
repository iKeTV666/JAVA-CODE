package com.fangfa.demo;

public class HW1 {
    public static void main(String[] args) {
        int c = findMin(1,1);
        System.out.println(c);
    }


    public static int findMin(int a,int b){
        if (a > b){
            return b;
        }else if (a == b){
            System.out.println("这两个数字相等");
            return a;
        }else {
            return a;
        }
    }
}
