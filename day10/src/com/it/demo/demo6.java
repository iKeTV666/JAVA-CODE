package com.it.demo;

public class demo6 {
    public static void main(String[] args) {
        String phoneNumber = "13812345678";
        String strat = phoneNumber.substring(0,3);
        String end = phoneNumber.substring(7,11);
        System.out.println(strat + "****" + end);
    }
}
