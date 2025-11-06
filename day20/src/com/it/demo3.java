package com.it;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo3 {
    public static void main(String[] args) throws ParseException {
        method();
        String str = "2023-03-20 15时30分00秒 星期一";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH时mm分ss秒 E");
        Date d = sdf.parse(str);
        System.out.println(d);
    }

    private static void method() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH时mm分ss秒 E");
        Date D1 = new Date(0L);
        String str = sdf.format(D1);
        System.out.println(str);
    }
}
