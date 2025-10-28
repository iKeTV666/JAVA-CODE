package com.it.demo;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z'){
                bigCount++;
            }else if (c >= 'a' && c <= 'z'){
                smallCount++;
            }else if (c >= '0' && c <= '9'){
                numberCount++;
            }
        }
    }
}
