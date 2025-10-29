package com.it.demo;

public class demo8 {
    public static void main(String[] args) {
        int[][] arr = new int[4][];
        int[] arr1 = {22,66,44};
        int[] arr2 = {77,33,88};
        int[] arr3 = {25,45,65};
        int[] arr4 = {11,66,99};
        arr[0] = arr1;
        arr[1] = arr2;
        arr[2] = arr3;
        arr[3] = arr4;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sun4 = 0;
        int yearSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0){
                    sum1 += arr[i][j];
                } else if (i == 1){
                    sum2 += arr[i][j];
                } else if (i == 2){
                    sum3 += arr[i][j];
                } else{
                    sun4 += arr[i][j];
                }
                yearSum += arr[i][j];
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sun4);
        System.out.println(yearSum);
    }
}
