package com.it.demo2;

public class demo12 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int sum = 0;
        for (int a = 0;a < arr.length;a++){
            sum = sum + arr[a];
        }
        System.out.println(sum);





        int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int num = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] % 3 == 0){
                num++;
            }
        }
        System.out.println(num);






        int [] arr2 = {1,2,3,4,5,6,7,8,9,10};
            for (int j = 0; j < arr2.length; j++) {
                if(arr2[j] % 2 == 0){
                    arr2[j] = arr2[j] / 2;
                } else if (arr2[j] % 2 != 0) {
                    arr2[j] = arr2[j] * 2;
                }
            }
        for (int k = 0; k < arr2.length; k++) {
            System.out.println(arr2[k]);
        }
        }
    }

