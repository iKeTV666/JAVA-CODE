package com.it.demo2;

import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        double pay = 0;
        if (a == 1 || a == 0){
            if (a == 0 && b < 100){
                System.out.println("应付" + b);
            }else if (a == 0 && b >= 100){
                pay = b * 0.9;
                System.out.println("应付" + pay);
            } else if (a == 1 && b < 200) {
                System.out.println("应付" + b * 0.8);
            } else if (a == 1 && b >= 200) {
                System.out.println("应付" + b * 0.75);
            }
        }else{
            System.out.println("输入错误");
        }
    }
}
