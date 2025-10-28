package com.it.demo;

import java.util.Random;
import java.util.Scanner;

public class deom13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            int a = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[a];
            arr[a] = temp;
        }
        System.out.println(arr);
    }
}
