package com.fangfa.demo;

public class HW10 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = copyOfRange(arr,1,3);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }



    public static int[] copyOfRange(int[] arr,int from, int to){
        int[] newArr = new int[to - from];
        int index = 0;
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}
