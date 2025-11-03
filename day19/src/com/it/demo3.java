package com.it;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo3 {
    public static void main(String[] args) {
        String str = "java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和JAva11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是JAVa17，相信在未来不久JAVA17也会逐渐登上历史舞台";
        Pattern p1 = Pattern.compile("((?i)java)(?=\\d{1,2})");
        Pattern p2 = Pattern.compile("((?i)java)(?:\\d{1,2})");
        Pattern p3 = Pattern.compile("((?i)java)(?!\\d{1,2})");
        Matcher m1 = p1.matcher(str);
        Matcher m2 = p2.matcher(str);
        Matcher m3 = p3.matcher(str);
        while(m1.find()){
            System.out.println(m1.group());
        }
        while(m2.find()){
            System.out.println(m2.group());
        }
        while(m3.find()){
            System.out.println(m3.group());
        }
    }
}
