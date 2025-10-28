package com.it.demo;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String str1 = sb.toString();
        if(str.equals(str1)){
            System.out.println("是回文字符串");
        }else{
            System.out.println("不是回文字符串");
        }
    }
}
