package com.it;

public class lihuaCat extends Cat{
    @Override
    public void eat() {
        System.out.println("一只叫" + getName() + "，" + getAge() + "岁的狸花猫在吃");
    }
}
