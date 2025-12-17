package com.it;

public class monkeyDemo {
    public static void main(String[] args) {
        //day10 : 1
        //day9 : (day10 + 1) * 2
        //day8 : (day9 + 1) * 2
        //...
        //day1 : (day2 + 1) * 2
        System.out.println(getPeach(1));
    }
    public static int getPeach(int day) {
        if (day == 10) {
            return 1;
        } else {
            return (getPeach(day + 1) + 1) * 2;
        }
    }
}
