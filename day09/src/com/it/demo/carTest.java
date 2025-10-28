package com.it.demo;

import java.util.Scanner;

public class carTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            System.out.println("请输入品牌");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("请输入颜色");
            String color = sc.next();
            c.setColor(color);
            System.out.println("请输入价格");
            int price = sc.nextInt();
            c.setPrice(price);
            arr[i] = c;
        }
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand());
            System.out.println(car.getColor());
            System.out.println(car.getPrice());
        }

        /*Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        System.out.println("请输入第一辆车的品牌：");
        String brand1 = sc.next();
        car1.setBrand(brand1);
        System.out.println("请输入第一辆车的颜色：");
        String color1 = sc.next();
        car1.setColor(color1);
        System.out.println("请输入第一辆车的价格：");
        int price1 = sc.nextInt();
        System.out.println("请输入第二辆车的品牌：");
        String brand2 = sc.next();
        car2.setBrand(brand2);
        System.out.println("请输入第二辆车的颜色：");
        String color2 = sc.next();
        car2.setColor(color2);
        System.out.println("请输入第二辆车的价格：");
        int price2 = sc.nextInt();
        System.out.println("请输入第三辆车的品牌：");
        String brand3 = sc.next();
        car3.setBrand(brand3);
        System.out.println("请输入第三辆车的颜色：");
        String color3 = sc.next();
        car3.setColor(color3);
        System.out.println("请输入第三辆车的价格：");
        int price3 = sc.nextInt();
        arr[0] = car1;
        arr[1] = car2;
        arr[2] = car3;
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand());
            System.out.println(car.getColor());
            System.out.println(car.getPrice());
        }*/
    }
}
