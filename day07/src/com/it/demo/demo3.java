package com.it.demo;

import java.util.Random;

public class demo3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr1 = {1,2,3,4,5,6,7,8,9,0};
        char[] arr2 = new char[52];
        for (int i = 0; i < arr2.length; i++) {
            if(i < 26){
                arr2[i] = (char)(97 + i);
                //System.out.println(arr2[i]);
            }else {
                arr2[i] = (char)(65 + i - 26);
               // System.out.println(arr2[i]);
            }
        }
        /*for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }*/
        Random r = new Random();
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if(i <= 3){
                int a = r.nextInt(51);
                //System.out.println(arr2[a]);
                str += arr2[a];

            }else {
                int b = r.nextInt(10);
                arr[i] = arr1[b];
                str += arr[i];
               // System.out.println(arr[i]);
            }
        }
        System.out.println(str);
    }
}
