package com.fangfa.demo;

public class demo5 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        int max = method(arr);
        System.out.println(max);
    }


    public static int method(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
