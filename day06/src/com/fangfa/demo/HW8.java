package com.fangfa.demo;

public class HW8 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = fill(arr,1,3,10);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }




    public static int[] fill(int[] arr,int fromIndex,int toIndex,int value){
        for (int i = fromIndex; i < toIndex; i++) {
            arr[i] = value;
        }
        return arr;
    }
}
