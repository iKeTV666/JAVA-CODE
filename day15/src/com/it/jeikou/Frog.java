package com.it.jeikou;

public class Frog extends animal implements swim {
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }

    @Override
    public void swim() {

    }
}
