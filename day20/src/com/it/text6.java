package com.it;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class text6 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String dateStr = sc.nextLine();
        String date = dateStr + "-01-01 00:00:00";
        int yearAfter = Integer.parseInt(dateStr) + 1;
        String date1 = yearAfter + "-01-01 00:00:00";
        //System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(date);
        Date d1 = sdf.parse(date1);
        long endTime = d1.getTime();
        long startTime = d.getTime();
        long days = endTime - startTime;
        days = days / (1000 * 60 * 60 * 24);
        System.out.println(days);
    }
}
