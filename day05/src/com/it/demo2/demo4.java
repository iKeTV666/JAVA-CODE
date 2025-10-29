package com.it.demo2;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = sc.nextInt();
        double year = sc.nextInt();
        double sum = 0;
        if (year == 1){
            sum = money + money * 0.0225 * year;
        } else if (year == 2) {
            sum = money + money * 0.027 * year;
        } else if (year == 3) {
            sum = money + money * 0.0325 * year;
        } else if (year == 5) {
            sum = money + money * 0.036 * year;
        }else {
            System.out.println("输入错误");
        }
    }
}
