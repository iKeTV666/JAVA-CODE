package com.it;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo5 {
    public static void main(String[] args) throws ParseException {
        String str1 = "2023-11-11 00:00:00";
        String str2 = "2023-11-11 00:10:00";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = sdf1.parse(str1);
        Date d2 = sdf1.parse(str2);
        long t1 = d1.getTime();
        long t2 = d2.getTime();
        String str3 = "2023年11月11日 00:01:00";
        String str4 = "2023年11月11日 00:11:00";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d3 = sdf2.parse(str3);
        Date d4 = sdf2.parse(str4);
        long t3 = d3.getTime();
        long t4 = d4.getTime();
        if (t3 >= t1 && t3 <= t2) {
            System.out.println("小贾赶上了");
        } else {
            System.out.println("小贾没有赶上");
        }
        if (t4 >= t1 && t4 <= t2) {
            System.out.println("小皮赶上了");
        } else {
            System.out.println("小皮没有赶上");
        }
    }
}
