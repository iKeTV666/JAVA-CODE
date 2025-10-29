package com.it.demo2;

import java.util.Scanner;

public class demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean flag = true;
        for(int i = 2;i < a;i++){
            if(a % i == 0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("是质数");
        }else {
            System.out.println("不是质数");
        }
    }
}
