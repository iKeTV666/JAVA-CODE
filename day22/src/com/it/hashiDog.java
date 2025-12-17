package com.it;

public class hashiDog extends Dog{
    @Override
    public void eat() {
        System.out.println("一只叫" + getName() + "，" + getAge() + "岁的哈士奇在吃");
    }
}
