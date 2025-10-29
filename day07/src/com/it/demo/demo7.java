package com.it.demo;

import java.util.Random;

public class demo7 {
    public static void main(String[] args) {
        int[] arr = {2,588,888,1000,10000};
        Random r = new Random();
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            //System.out.println(arr[index]);
            for (int j = 0; j < arr1.length;) {
                if(arr1[j] != arr[index]){
                    arr1[j] = arr[index];
                    j++;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
         //   System.out.println(arr1[]);
        }
    }
}
