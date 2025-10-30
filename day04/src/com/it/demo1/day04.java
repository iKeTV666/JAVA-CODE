package com.it.demo1;

import java.util.Scanner;

public class day04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a >= 600){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }




        int b = sc.nextInt();
        if(b == 1){
            System.out.println("需支付" + 1000 * 0.9);
        }else if(b == 2){
            System.out.println("需支付" + 1000 * 0.8);
        }else if(b == 3){
            System.out.println("需支付" + 1000 * 0.7);
        }else{
            System.out.println("输入错误");
        }




        

    }
}
