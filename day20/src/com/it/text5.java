package com.it;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class text5 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime birthday = LocalDateTime.of(2004, 12, 2, 0, 0, 0);
        Duration d = Duration.between(birthday,now);
        long days = d.toDays();
        long year = ChronoUnit.YEARS.between(birthday, now);
        System.out.println(days);
        System.out.println(year);
    }
}
