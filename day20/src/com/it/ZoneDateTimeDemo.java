package com.it;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo {
    public static void main(String[] args) {
        //获取当前时间的时间戳(带时区)
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        //获取指定时区的zoneddatetime对象
        Instant instant1 = Instant.ofEpochSecond(0l);
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime time = ZonedDateTime.ofInstant(instant1, zoneId);
        System.out.println(time);
        //修改zoneddatetime对象的年、月、日、时、分、秒
        ZonedDateTime time1 = time.withYear(2025);
        System.out.println(time1);
        //增加减少年月日等
        ZonedDateTime time2 = time1.minusYears(1);
        System.out.println(time2);
        ZonedDateTime time3 = time1.plusYears(1);
        System.out.println(time3);
    }
}
