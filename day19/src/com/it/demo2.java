package com.it;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo2 {
    public static void main(String[] args) {
        String s = "来黑马程序员学习Java，" +
                "电话:18512516758，18512508907" + "或者联系邮箱:boniu@itcast.cn，" +
                "座机电话:01036517895，010-98951256" + "邮箱:bozai@itcast.cn，" +
                "热线电话:400-618-9090 ，400-618-4000，4006184000，4006189090";
        Pattern p1 = Pattern.compile("1[3-9]\\d{9}");
        Pattern p2 = Pattern.compile("\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}");
        Pattern p3 = Pattern.compile("0\\d{2,3}-?[1-9]\\d{4,9}");
        Pattern p4 = Pattern.compile("400-?[1-9]\\d{2}-?[1-9]\\d{3}");
        //更为简洁的方式
        Pattern p5 = Pattern.compile("(1[3-9]\\d{9})|(\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2})|(0\\d{2,3}-?[1-9]\\d{4,9})|(400-?[1-9]\\d{2}-?[1-9]\\d{3})");
        Matcher m1 = p1.matcher(s);
        Matcher m2 = p2.matcher(s);
        Matcher m3 = p3.matcher(s);
        Matcher m4 = p4.matcher(s);
        Matcher m5 = p5.matcher(s);
        while(m1.find()){
            System.out.println(m1.group());
        }
        while(m2.find()){
            System.out.println(m2.group());
        }
        while(m3.find()){
            System.out.println(m3.group());
        }
        while(m4.find()){
            System.out.println(m4.group());
        }
        while(m5.find()){
            System.out.println(m5.group());
        }
    }
}
