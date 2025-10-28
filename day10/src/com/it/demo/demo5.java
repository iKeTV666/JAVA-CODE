package com.it.demo;

import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入一个金额");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999){
                break;
            }else {
                System.out.println("金额输入错误");
            }
        }
        //System.out.println("您输入的金额为：" + money);
        String big = getBig(money);
        //System.out.println(big);
        int count = 7 - big.length();
        for (int i = 0; i < count; i++) {
            big = "零" + big;
        }
        System.out.println(big);
        String unit = "佰拾万仟佰拾元";
        String result = "";
        for (int i = 0; i < big.length(); i++) {
            result = result + big.charAt(i) + unit.charAt(i);
        }
        System.out.println(result);
    }
    public static String getBig(int money){
        String[] str = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        String arr = "";
        for (int i = 0; i < str.length; i++) {
            if (money % 10 == 0){
                break;
            }
            arr = str[money % 10] + arr;
            money = money / 10;
        }
        return arr;
    }
}
