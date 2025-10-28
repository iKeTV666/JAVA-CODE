package com.it.demo;

import java.util.Random;

public class demo14 {
    public static void main(String[] args) {
        char[] str = new char[5];
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i < 26){
                arr[i] = (char) (97 + i);
            }else {
                arr[i] = (char) (65 + i - 26);
            }
        }
        Random r = new Random();
        int num = r.nextInt(10);
        int place = r.nextInt(str.length);
        for (int i = 0; i < str.length; i++) {
            int index = r.nextInt(arr.length);
            str[i] = arr[index];
        }
        //System.out.println(str);
        str[place] = (char)(num + '0');
        System.out.println(str);
    }
}
