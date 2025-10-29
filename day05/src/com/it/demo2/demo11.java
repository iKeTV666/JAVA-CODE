package com.it.demo2;

import java.util.Random;

public class demo11 {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(100) + 1;
        for(int b = 1;b <= 100;b++){
            if(a == b){
                System.out.println("随机数为：" + b);
            }
        }
    }
}
