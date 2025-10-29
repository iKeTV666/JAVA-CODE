package com.fangfa.demo;

import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int a = sc.nextInt();
        boolean b = method(a, arr);
        if (b){
            System.out.println("这个数字在数组中");
        }else {
            System.out.println("这个数字不在数组中");
        }
    }


    public static boolean method(int a,int[] arr){
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]){
                return true;
            }else {
                flag = false;
            }
        }
        return flag;
    }
}
