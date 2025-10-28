package com.it.demo;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        String rightPassword = "123456";
        String rightUsername = "admin";
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (count < 3){
            String username = sc.next();
            String password = sc.next();
            if (rightUsername.equals(username) && rightPassword.equals(password)){
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("登录失败");
                count++;
            }
        }
        if (count == 3){
            System.out.println("登录失败");
        }
    }
}
