package com.it.demo1;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("beichushu");
        int a = sc.nextInt();
        System.out.println("chushu");
        int b = sc.nextInt();
        int sum = 0;
        while (a >= b){
            a -= b;
            sum++;
        }
        System.out.println(sum);
        System.out.println(a);
    }
}
