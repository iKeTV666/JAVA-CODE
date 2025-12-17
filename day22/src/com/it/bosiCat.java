package com.it;

public class bosiCat extends Cat{
    @Override
    public void eat() {
        System.out.println("一只叫" + getName() + "，" + getAge() + "岁的波斯猫在吃");
    }
}
