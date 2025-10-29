package com.it.demo;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入原价");
        double price = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("请输入舱位");
        String seat = sc.next();
        if(month >= 5 && month <= 10){
            if (seat.equals("头等舱")){
                price = price * 0.9;
            }else if(seat.equals("经济舱")){
                price = price * 0.85;
            }
        } else if (month >= 11 && month <= 12 || month >= 1 && month <= 4) {
            if (seat.equals("头等舱")){
                price = price * 0.7;
            }else if(seat.equals("经济舱")){
                price = price * 0.65;
            }
        }
        System.out.println(price);
    }
}
