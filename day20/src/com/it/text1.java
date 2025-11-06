package com.it;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class text1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数");
            String str = sc.nextLine();
            int i = Integer.parseInt(str);
            if (i < 1 || i > 100) {
                System.out.println("请输入1-100之间的整数");
                continue;
            }
            list.add(i);
            int sum = getSum(list);
            if (sum > 200) {
                break;
            }
        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
