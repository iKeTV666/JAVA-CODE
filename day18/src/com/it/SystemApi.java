package com.it;

public class SystemApi {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];
        //System.arraycopy(arr1,0,arr2,4,3);
        System.arraycopy(arr1,6,arr2,2,3);
        System.out.print("arr2数组为：[");
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1){
                System.out.print(arr2[i]);
            }else{
                System.out.print(arr2[i] + ",");
            }
        }
        System.out.println("]");
    }
}
