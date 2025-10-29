package com.it.demo;

import java.util.Random;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int[] arr = method();
        int[] arr1 = method3();
        int countRed = 0;
        int countBlue = 0;
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == arr1[i]){
                    countRed++;
                    break;
                }
            }
        }
        if (arr1[arr1.length] == arr[arr.length]){
            countBlue++;
        }
        if (countRed == 6 && countBlue == 1){
            System.out.println("恭喜你中了一等奖");
        }else if (countRed == 6 && countBlue == 0){
            System.out.println("恭喜你中了二等奖");
        }else if (countRed == 5 && countBlue == 1){
            System.out.println("恭喜你中了三等奖");
        }else if (countRed == 5 && countBlue == 0){
            System.out.println("恭喜你中了四等奖");
        }else if (countRed == 4 && countBlue == 1){
            System.out.println("恭喜你中了四等奖");
        }
        else if (countRed == 4 && countBlue == 0){
            System.out.println("恭喜你中了五等奖");
        }
        else if (countRed == 3 && countBlue == 1){
            System.out.println("恭喜你中了五等奖");
        }
        else if (countRed == 2 && countBlue == 1){
            System.out.println("恭喜你中了六等奖");
        }
        else if (countRed == 1 && countBlue == 1){
            System.out.println("恭喜你中了六等奖");
        }
        else if (countRed == 0 && countBlue == 1){
            System.out.println("恭喜你中了六等奖");
        } else{
            System.out.println("很遗憾，你没有中");
        }
    }




    public static int[] method3(){
        int[] arr1 = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr1.length - 1;) {

            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int red = sc.nextInt();
            if(red >= 1 && red <= 33){
                boolean flag = method2(arr1,red);
                if (!flag){
                    arr1[i] = red;
                    i++;
                }else{
                    System.out.println("重复");
                }
            }else{
                System.out.println("输入错误");
            }
        }

        while (true) {
            int blue = sc.nextInt();
            if (blue >= 1 && blue <= 16){
                arr1[6] = blue;
                break;
            }else{
                System.out.println("输入错误");
            }
        }
        return arr1;
    }


    public static int[] method(){
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < 6;) {
            int red = r.nextInt(33) + 1;
            boolean flag = method2(arr,red);
            if (!flag){
                arr[i] = red;
                i++;
            }
        }
        int blue = r.nextInt(16) + 1;
        arr[6] = blue;
        return arr;
    }


    public static boolean method2(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return true;
            }
        }
        return false;
    }
}
