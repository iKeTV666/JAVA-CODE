package com.it;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeForMatterDemo {
    public static void main(String[] args) {
        ZonedDateTime time1 = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE");
        System.out.println(dtf1.format(time1));
    }
}
