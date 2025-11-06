package com.it;

import java.util.Scanner;

public class text3 {
    public static void main(String[] args) {
        System.out.println(extracted());
    }

    private static String extracted() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (true) {
            if(a == 0){
                break;
            }
            int i = a % 2;
            sb.insert(0,i);
            a /= 2;
        }
        return sb.toString();
    }
}
