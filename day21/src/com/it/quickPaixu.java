package com.it;

public class quickPaixu {
    public static void main(String[] args) {
        int[] arr = {6,4,7,3,1,5,9,8,2,10};
        QP(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void QP(int[] arr,int i,int j){
        int start = i;
        int end = j;
        if (i >= j){
            return;
        }
        int base = arr[i];
        while (start != end){
            while (true){
                if (end <= start || arr[end] < arr[i]){
                    break;
                }
                end--;
            }
            while (true){
                if (end <= start || arr[start] > arr[i]){
                    break;
                }
                start++;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;
        QP(arr,i,start-1);
        QP(arr,start+1,j);
    }
}
