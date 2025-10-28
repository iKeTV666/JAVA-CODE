package com.it.demo;

public class demo10 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(connect(arr));
    }



    public static String connect(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1){
                sb.append(arr[i] + ",");
            }else{
                sb.append(arr[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
