package com.it.demo2;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        int [] arr = {12,14,23,45,66,68,70,77,90,91};
        int [] arr1 = new int[11];
        int index = 0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        arr1[arr1.length - 1] = a;
        int min = arr1[arr1.length - 1];
        for (int i = 0; i < arr1.length; i++) {

        }
    }
}
