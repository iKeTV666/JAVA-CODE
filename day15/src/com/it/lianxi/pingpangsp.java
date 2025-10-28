package com.it.lianxi;

public class pingpangsp extends spoter implements inter {
    public pingpangsp() {
    }

    public pingpangsp(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
