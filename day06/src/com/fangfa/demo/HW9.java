package com.fangfa.demo;

public class HW9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = copyOf(arr,3);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }




    public static int[] copyOf(int[] arr, int newLength){
        int[] newArr = new int[newLength];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
