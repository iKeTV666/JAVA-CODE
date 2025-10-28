package com.it.jeikou;

public class Dog extends animal implements swim {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("狗吃狗粮");
    }

    @Override
    public void swim() {
        System.out.println("狗会游泳");
    }
}
