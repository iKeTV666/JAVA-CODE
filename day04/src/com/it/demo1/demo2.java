package com.it.demo1;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        for(int a = 1;a <= 5;a++){
            System.out.println(a);
        }
        System.out.println("----------------");
        for(int b = 5;b >= 1;b--){
            System.out.println(b);
        }

        int d = 0;
        for(int c = 1;c <= 5;c++){
            d = c + d;
            System.out.println(d);
        }

        int f = 0;
        for(int e = 1;e <= 100;e++){
            if(e % 2 == 0){
                f += e;
            }
            System.out.println(f);
        }





        Scanner sc = new Scanner(System.in);
        System.out.println("第一个");
        int g = sc.nextInt();
        System.out.println("第二个");
        int h = sc.nextInt();
        int k = 0;
        if(g > h){
            for(int z = h;z <= g;z++){
                if (z % 3 == 0 && z % 5 == 0){
                    k++;
                }
            }
        }else if (g < h){
            for(int z = g;z <= h;z++){
                if (z % 3 == 0 && z % 5 == 0){
                    k++;
                }
            }
        }else if(g == h){
            if (g % 3 == 0 && g % 5 == 0){
                k++;
            }
        }
        System.out.println("这样的数字有" + k + "个");
    }
}
