package com.it;

import java.util.Calendar;
import java.util.Date;

public class demo6 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        //System.out.println(c);
        Date d = new Date(0l);
        c.setTime(d);
        System.out.println(c);
        c.set(Calendar.YEAR,2025);
        c.set(Calendar.MONTH,11);
        c.set(Calendar.DAY_OF_MONTH,31);
        c.add(Calendar.YEAR,1);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(getWeek(week));
    }
    public static String getWeek(int week) {
        String[] arr = {"","周日","周一","周二","周三","周四","周五","周六"};
        return arr[week];
    }
}
