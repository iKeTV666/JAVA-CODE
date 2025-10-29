package com.it.demo;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = findSu(a,b);
        System.out.println(count);
    }


    public static int findSu(int a,int b){
        int count = 0;

        //if(a < b){

            for(int p = a;p <= b;p++){
                boolean flag = true;
                for(int i = 2;i < p;i++){
                    if(p % i == 0){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.println(p + "是质数");
                    count++;
                }
            }
        //}
        /*else if (a > b) {

            for(int p = b;p <= a;p++){
                boolean flag = true;
                for(int i = 2;i < p;i++){
                    if(p % i == 0){
                        flag = false;
                        break;
                    }
                    if(flag){
                        count++;
                    }
                }

            }
        }else if(a == b){
            for (int i = 2; i < a;i++){
                if(a % i == 0){
                    System.out.println(a + "不是质数");
                    break;
                }else{
                    System.out.println(a + "是质数");
                }
            }
        }*/

        return count;
    }
}
