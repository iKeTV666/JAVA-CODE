package com.it;

import java.sql.Date;

public class dateDemo1 {
    public static void main(String[] args) {
        Date d = new Date(0l);
        long time = d.getTime();
        time = time + 1000l * 60 * 60 * 24 * 365;
        d.setTime(time);
        System.out.println(d);
    }
}
