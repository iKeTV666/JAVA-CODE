package com.it.demo2;

import java.util.Random;

public class demo13 {
    public static void main(String[] args) {
        /*int [] arr = {33,5,22,44,55};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);*/

        int [] arr = new int[10];
        Random r = new Random();
        for (int b = 0;b < 10;b++){
            int a = r.nextInt(100) + 1;
            //System.out.println(a);
            arr[b] = a;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            sum = sum + arr[i];
        }
        System.out.println(sum);
        System.out.println(sum / arr.length);

        int num = 0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] < sum / arr.length) {
                num++;
            }
        }
        System.out.println(num);
    }
}
