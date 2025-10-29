package com.it.demo;

import java.util.Random;

public class demo5 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        int sum = 0;
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(101);
        }
        int max = getMax(arr);
        int min = getMin(arr);
        System.out.println("最大值为：" + max);
        System.out.println("最小值为：" + min);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组的和为：" + sum);
        System.out.println("分数为：" + (sum - (max + min)) / 4);
    }



    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

}
