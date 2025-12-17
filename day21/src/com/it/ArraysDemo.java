package com.it;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        String s1 = Arrays.toString(arr);
        System.out.println(s1);


        //查找数组必须是有序地
        int i = Arrays.binarySearch(arr, 4);
        System.out.println(i);


        int[] arr1 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = Arrays.copyOf(arr, 2);
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = Arrays.copyOf(arr, 20);
        System.out.println(Arrays.toString(arr3));



        int[] arr4 = Arrays.copyOfRange(arr, 2, 5);
        System.out.println(Arrays.toString(arr4));


        Arrays.fill(arr,1);
        System.out.println(Arrays.toString(arr));


        int[] arr5 = {2,1,4,6,5,7};
        Arrays.sort(arr5);
        System.out.println(Arrays.toString(arr5));
        Integer[] arr6 = {2,1,4,6,5,7};
        Arrays.sort(arr6, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr6));
    }
}
