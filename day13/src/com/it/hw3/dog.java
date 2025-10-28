package com.it.hw3;

public class dog extends animal{
    public dog() {
    }

    public dog(int age, String color) {
        super(age, color);
    }
    public void lookHome() {
        System.out.println("看家");
    }
    @Override
    public void eat(String something) {
        System.out.println("颜色为" + getColor() + "的" + getAge() + "岁的狗，" + "正在吃" + something);
    }
}
