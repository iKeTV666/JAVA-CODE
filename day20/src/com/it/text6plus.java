package com.it;

import java.util.Calendar;
import java.util.Scanner;

public class text6plus {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int yearAfter = year + 1;
        c.set(yearAfter,0,1);
        c.add(Calendar.DAY_OF_MONTH,-1);
        long days = c.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);
    }
}
