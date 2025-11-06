package com.it;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo4 {
    public static void main(String[] args) throws ParseException {
        String str = "2000-11-11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(str);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        String str1 = sdf1.format(d);
        System.out.println(str1);
        //System.out.println(d);
    }
}
