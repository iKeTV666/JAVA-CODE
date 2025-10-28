package com.it.shouiji;

public class phoneTest {
    public static void main(String[] args) {
        Phone.size = 6;
        Phone p1 = new Phone("小米",1999);
        p1.call();
        p1.sendMessage();
        p1.playGame();
        System.out.println(Phone.size);
        Phone p2 = new Phone("华为",2999);
        p2.call();
        p2.sendMessage();
        p2.playGame();
        System.out.println(Phone.size);
    }
}
