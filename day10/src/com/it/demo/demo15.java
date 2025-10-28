package com.it.demo;

import java.util.Scanner;

public class demo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        int eng = 0;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            eng += equaleng(a);
            num += querynum(a);
        }
        System.out.println("字母有" + eng + "个");
        System.out.println("数字有" + num + "个");
    }
    public static int equaleng(char a){
        int eng = 0;
        if (a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z'){
            eng++;
        }
        return eng;
    }
    public static int querynum(char a){
        int num = 0;
        if (a >= '0' && a <= '9'){
            num++;
        }
        return num;
    }
}
