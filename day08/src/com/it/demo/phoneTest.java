package com.it.demo;

public class phoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setBrand("小米");
        p1.setPrice(2999);
        p1.setColor("黑色");
        Phone p2 = new Phone();
        p2.setBrand("苹果");
        p2.setPrice(6999);
        p2.setColor("白色");
        p1.call();
        p1.sendMessage();
        p2.call();
        p2.sendMessage();
    }
}
