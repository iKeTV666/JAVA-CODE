package com.it;

public class erfenSerch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int a = erfenSerch(arr, 11);
        System.out.println(a);
    }

    public static int erfenSerch(int[] arr,int a) {
        int min = 0;
        int max = arr.length - 1;
        while (true) {
            if (min > max) {
                return -1;
            }
            int mid = (min + max) / 2;
            if (arr[mid] > a) {
                max = mid - 1;
            }else if (arr[mid] < a) {
                min = mid + 1;
            }else {
                return mid;
            }
        }
    }
}
