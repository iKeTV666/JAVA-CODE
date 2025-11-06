package com.it;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(2022, 9, 30, 23, 59, 59);
        long berth = ChronoUnit.YEARS.between(localDateTime1, now);
        System.out.println(berth);
        //月日同理
    }
}
