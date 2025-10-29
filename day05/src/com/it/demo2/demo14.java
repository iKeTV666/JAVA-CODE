package com.it.demo2;

public class demo14 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        /*int [] arr1 = new int[arr.length];
        int [] arr3 = new int[arr.length];

        for (int i = arr.length - 1;i >= 0;i--){
            //System.out.println(arr[i]);
            int k = 0;
            while (k < arr1.length - 1){
                arr3[k] = arr[i];
                k++;
            }
            for (int j = 0; j < arr3.length; j++) {
                System.out.println(arr3[k]);
            }
            for (int k = 0;k < arr1.length - 1;k++){
                arr3[k] = arr[i];
                System.out.println(arr3[k]);
            }*/


        for (int a = 0, b = arr.length - 1; a < b; a++, b--) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }
}

