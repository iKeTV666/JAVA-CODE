package com.fangfa.demo;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int a = sc.nextInt();
        System.out.println(method(a));
    }



    public static int method(int a){
        int wei = 0;
        for (int i = 0; a % 10 != 0;i++){
            a = a / 10;
            wei++;
        }
        return wei;
    }
}
