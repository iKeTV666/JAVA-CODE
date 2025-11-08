package com.it;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class text4 {
    public static void main(String[] args) throws ParseException {
        String birthday = "2004-12-02";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(birthday);
        //System.out.println(d.getTime());
        long birTime = d.getTime();
        long now = System.currentTimeMillis();
        //System.out.println(now);
        long age = now - birTime;
        System.out.println(age/1000/60/60/24/365);
    }
}
