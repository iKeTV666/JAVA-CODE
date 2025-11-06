package com.it;

import java.util.Scanner;

public class text2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        //1234
        while (true) {
            System.out.println("请输入一个字符串");
            String str = sc.nextLine();
            String regex = "[1-9]\\d{0,9}";
            if (!str.matches(regex)) {
                System.out.println("请输入一个正确的字符串");
                continue;
            }
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - '0';
                /*int j = str.length() - 1;
                sum += (int) (c * Math.pow(10,j-i));*/
                sum = sum * 10 + c;
            }
                System.out.println(sum);
            System.out.println(sum + 1);
            break;
        }
    }
}
