package com.it.demo2;

public class HW1 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        for (int i = 0, j = 1; i < 6; i++, j++) {
            arr[i] = j;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }


        double[] arr1 = {12.9, 53.54, 75.0, 99.1, 3.14};
        double min = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < min) {
                min = arr1[i];
            }
        }
        System.out.println(min);
    }
}
