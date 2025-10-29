package com.it.demo;

public class test {
    public static void main(String[] args) {
        int a = 1234;
        int count = 0;
        int temp = a;
        while (a != 0){
            a = a / 10;
            count++;
        }
        //System.out.println(count);
        int[] arr = new int[count];
        int index = arr.length - 1;
        while (temp != 0){
            int ge = temp % 10;
            temp = temp / 10;
            arr[index] = ge;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
