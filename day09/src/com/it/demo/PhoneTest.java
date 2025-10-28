package com.it.demo;

public class PhoneTest {
    public static void main(String[] args) {
        double price = 0;
        Phone[] arr = new Phone[3];
        Phone p = new Phone();
        p.setBrand("小米");
        p.setColor("黑色");
        p.setPrice(2999);
        arr[0] = p;
        Phone p1 = new Phone("华为","白色",3999);
        arr[1] = p1;
        Phone p2 = new Phone("oppo","红色",4999);
        arr[2] = p2;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            price += phone.getPrice();
        }
        System.out.println("平均价格为：" + price / arr.length);
    }
}
