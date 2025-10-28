package com.it.demo;

public class demo3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        String str = connect(arr);
        System.out.println(str);
    }



    public static String connect(int[] arr){
        if(arr == null){
            return "";
        }
        if(arr.length == 0){
            return "[]";
        }
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if(arr.length - 1 == i){
                str = str + arr[i];
            }else {
                str = str + arr[i] + ",";
            }
        }
        return str + "]";
    }
}
