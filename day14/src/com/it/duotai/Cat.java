package com.it.duotai;

public class Cat extends animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }
    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "猫正在吃" + something);
    }
    public void catchMouse() {
        System.out.println("猫正在抓老鼠");
    }
}
