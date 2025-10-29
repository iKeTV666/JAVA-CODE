package com.fangfa.demo;

public class HW7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = fill(arr,10);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }


    public static int[] fill(int[] arr,int value){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        return arr;
    }
}
