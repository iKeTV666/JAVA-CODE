package com.fangfa.demo;

public class demo7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = method(arr, 3, 7);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }



    public static int[] method(int[] arr,int form,int to){
        int[] arr1 = new int[to - form];
        int j = 0;
        for (int i = form;i <= to - 1;i++){
            arr1[j] = arr[i];
            j++;
        }
        return arr1;
    }
}
