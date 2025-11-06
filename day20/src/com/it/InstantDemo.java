package com.it;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo {
    public static void main(String[] args) {
        //获取当前时间的时间戳
        Instant now = Instant.now();
        System.out.println(now);
        //根据秒、毫秒等获取时间戳
        Instant instant1 = Instant.ofEpochSecond(1l);
        System.out.println(instant1);
        //指定时区
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);
        //比较时间
        Instant instant2 = Instant.ofEpochSecond(0l);
        Instant instant3 = Instant.ofEpochSecond(4l);
        boolean after = instant2.isAfter(instant3);
        System.out.println(after);
        //增减时间
        Instant instant4 = instant2.plusSeconds(1l);
        System.out.println(instant4);
        Instant instant5 = instant3.minusSeconds(1l);
        System.out.println(instant5);
    }
}
