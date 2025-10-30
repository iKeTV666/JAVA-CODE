package com.it;

import java.util.Scanner;

public class MathApi {
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isZS = isZhiShu(num);
        if (isZS){
            System.out.println("是质数");
        }else {
            System.out.println("不是质数");
        }
    }
    public static boolean isZhiShu(int num){
        if(num <= 1){
            return false;
        }

        for(int i = 2;i <= Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
