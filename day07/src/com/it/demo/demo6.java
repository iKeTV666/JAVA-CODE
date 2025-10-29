package com.it.demo;

import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] password = getPassword(a);

        for (int i = 0; i < password.length; i++) {
            password[i] = password[i] + 5;
        }
        for (int i = 0; i < password.length; i++) {
            password[i] = password[i] % 10;
        }
        /*int j = 0;
        for (int i = password.length - 1; i >= 0; i--) {
            newPassword[j] = password[i];
            j++;
        }*/
        for (int i = 0,j = password.length - 1; i < j; i++,j--) {
            int temp = password[i];
            password[i] = password[j];
            password[j] = temp;
        }
        int number = 0;
        for (int i = 0; i < password.length; i++) {
            number = number * 10 + password[i];
        }
        System.out.println(number);
    }


    public static int[] getPassword(int a){
        int count = 0;
        int temp = a;
        while (a != 0){
            a = a / 10;
            count++;
        }
        int[] arr = new int[count];
        int index = arr.length - 1;
        while (temp != 0){
            int ge = temp % 10;
            temp = temp / 10;
            arr[index] = ge;
            index--;
        }
        return arr;
    }
}
