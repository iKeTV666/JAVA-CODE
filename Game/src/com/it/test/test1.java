package com.it.test;

import java.util.Random;

public class test1 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random random = new Random();
        for(int i = 0;i < arr.length;i++){
            int index = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        int[][] arr1 = new int[4][4];
        int Index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr1[i][j] = arr[Index];
                Index++;
            }
        }
        /*for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }*/
    }
}
