package com.it.demo;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        String reverse = getReverse(str);
        System.out.println(reverse);
    }


    public static String getReverse(String arr){
        if(arr == null){
            return "";
        }
        if(arr.length() == 0){
            return "";
        }
        String str = "";
        for (int i = arr.length() - 1; i >= 0; i--) {
            char c = arr.charAt(i);
            str = str + c;
        }
        return str;
    }
}
