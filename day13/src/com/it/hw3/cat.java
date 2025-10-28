package com.it.hw3;

public class cat extends animal{
    public cat() {
    }

    public cat(int age, String color) {
        super(age, color);
    }
    public void catchMouse() {
        System.out.println("正在抓老鼠");
    }
    @Override
    public void eat(String something) {
        System.out.println("颜色为" + getColor() + "的" + getAge() + "岁的猫，" + "正在吃" + something);
    }
}
