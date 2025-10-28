package com.it.jeikou;

public class Rabbit extends animal {
    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("兔子吃萝卜");
    }
}
