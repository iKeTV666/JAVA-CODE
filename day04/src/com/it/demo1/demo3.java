package com.it.demo1;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        double a = 0.1;
        int b = 0;
        while(a < 8844430){
            a = a * 2;
            b++;
        }
        System.out.println(b);


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int c = sc.nextInt();
        //临时记录c的值
        int temp = c;
        int sum = 0;
        while (c != 0 ){
            int ge = c % 10;
            c = c / 10;
            sum = sum * 10 + ge;
        }
        if(sum == temp){
            System.out.println("是回文数");
        }else{
            System.out.println("不是回文数");
        }
    }
}
