package com.it.duotai;

public class Dog extends animal {
    public Dog() {
    }
    public Dog(int age, String color) {
        super(age, color);
    }
    @Override
    public void eat(String something) {
        System.out.println("年龄为" + getAge() + "的" + getColor() + "狗正在吃" + something);
    }
    public void lookHome() {
        System.out.println("狗正在看家");
    }
}
