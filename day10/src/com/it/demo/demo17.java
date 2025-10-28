package com.it.demo;

import java.util.Scanner;

public class demo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        boolean flag = judgeNumber(str);
        if(flag){
            System.out.println("这是一个正确的身份证号");
        }else {
            System.out.println("这不是一个正确的身份证号");
        }
    }


    public static boolean judgeNumber(String str){
        boolean flag = true;
        char[] arr = str.toCharArray();
        if(str.length() == 18){
            for (int i = 0; i < arr.length; i++) {
                if(arr[0] == '0'){
                    flag = false;
                    return flag;
                }
            }
            String end = str.substring(0,17);
            char[] b = end.toCharArray();
            for (int i = 0; i < b.length; i++) {
                if(b[i] >= '0' && b[i] <= '9' && (arr[arr.length-1] == 'X' || arr[arr.length-1] >= '0' && arr[arr.length-1] <= '9')){
                    flag = true;
                }else {
                    flag = false;
                    return flag;
                }
            }

        }else {
            flag = false;
        }
        return flag;
    }
}
