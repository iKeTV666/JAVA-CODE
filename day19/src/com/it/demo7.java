package com.it;

public class demo7 {
    public static void main(String[] args) {
        String str = "我要学学编编编编程程程程程程";
        String str1 = str.replaceAll("(.)\\1+", "$1");
        System.out.println(str1);
    }
}
