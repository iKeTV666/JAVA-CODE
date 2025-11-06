package com.it;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Random;

public class demo2 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        Random r = new Random();
        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));
        long time1 = d1.getTime();
        long time2 = d2.getTime();
        if (time1 > time2){
            System.out.println("时间1在时间2之后");
        } else if (time2 > time1){
            System.out.println("时间2在时间1之后");
        }else {
            System.out.println("时间1和时间2相同");
        }
    }
}
