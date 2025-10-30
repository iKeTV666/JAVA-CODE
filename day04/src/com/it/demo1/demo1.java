package com.it.demo1;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输星期");
        int a = sc.nextInt();
        if(a >= 1 && a <= 5){
            System.out.println("工作日");
        }else if(a >= 6 && a <= 7){
            System.out.println("休息日");
        }else{
            System.out.println("输入错误");
        }

        int b = sc.nextInt();
        switch (b){
            case 1:
                System.out.println("机票查询");
                break;
            case 2:
                System.out.println("机票预订");
                break;
            case 3:
                System.out.println("机票改签");
                break;
            default:
                System.out.println("退出");
                break;
        }





    }
}
