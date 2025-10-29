package com.it.demo2;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        for(int i = a; i <= b; i++){
            if(i % 7 == 0 || i % 10 == 7 || i / 10 % 10 == 7){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int c = sc.nextInt();
        int d = 1;
        while (d <= c){
            d++;
            if (d * d == c){
                System.out.println(d);
                break;
            } else if (d * d > c) {
                System.out.println(d - 1);
                break;
            }
        }
    }
}
