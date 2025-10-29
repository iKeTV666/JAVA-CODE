package com.it.demo2;

import java.util.Random;

public class HW2 {
    public static void main(String[] args) {
        int [] arr = new int[6];
        Random r = new Random();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);

        }
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }
        System.out.println(sum);




        int [] arr1 = new int[6];
        for (int i = 0; i < arr1.length; i++) {
            int num = r.nextInt(10);
            arr1[i] = num;
        }

        int add = 0;
        for (int i = 0; i < arr1.length; i++) {
            add = add * 10 + arr1[i];
        }
        System.out.println(add);
    }
}
