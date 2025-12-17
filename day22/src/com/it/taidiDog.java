package com.it;

public class taidiDog extends Dog{
    @Override
    public void eat() {
        System.out.println("一只叫" + getName() + "，" + getAge() + "岁的泰迪在吃");
    }
}
