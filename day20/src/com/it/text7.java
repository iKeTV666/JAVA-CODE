package com.it;

import java.time.LocalDate;

public class text7 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, 1, 1);
        LocalDate date1 = date.minusDays(1);
        System.out.println(date1.getDayOfYear());
        System.out.println(date.isLeapYear());
    }
}
