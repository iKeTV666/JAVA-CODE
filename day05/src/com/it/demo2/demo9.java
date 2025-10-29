package com.it.demo2;

public class demo9 {
    public static void main(String[] args) {

        /*for(int a = 1949;a <= 2019;a++){
            int b = 2019 - a;
            //System.out.println(a);
            if(b % 12 == 0){
                System.out.println(a);
            }
        }*/



        for(int a = 1988;a <= 2019;a++){
            if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0){
                System.out.println(a);
            }
        }



    }
}
