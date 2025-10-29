package com.fangfa.demo;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字");
        int c = sc.nextInt();
        sum(a,b,c);
    }


    public static void sum(int a,int b,int c){
        if (a > b && a > c && b > c){
            System.out.print(a + " " + b + " " + c);
        }else if (a > b && a > c && c > b){
            System.out.print(a + " " + c + " " + b);
        }else if (b > a && b > c && a > c){
            System.out.print(b + " " + a + " " + c);
        }else if (b > a && b > c && c > a){
            System.out.print(b + " " + c + " " + a);
        }else if (c > a && c > b && a > b){
            System.out.print(c + " " + a + " " + b);
        }else if (c > a && c > b && b > a){
            System.out.print(c + " " + b + " " + a);
        }else {
            System.out.println("这三个数字相等");
        }
    }
}
