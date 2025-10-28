package com.it.demo;

import java.util.Scanner;
import java.util.StringJoiner;

public class demo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个字符串");
            String str = sc.next();
            boolean flag = right(str);
            if(flag){
                change(str);
                break;
            }else {
                System.out.println("输入的字符串不符合要求");
            }
        }
    }
    public static boolean right(String str){
        if(str.length() <= 9){
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
                if(a >= '0' && a <= '9'){
                   return true;
                }
            }
        }
        return false;
    }
    public static void change(String str){
        String[] str1 = {"","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        StringJoiner sj = new StringJoiner(",");
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            sj.add(str1[a - '0']);
        }
        System.out.println(sj.toString());
    }
}
