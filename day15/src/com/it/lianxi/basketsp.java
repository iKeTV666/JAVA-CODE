package com.it.lianxi;

public class basketsp extends spoter{
    public basketsp() {
    }

    public basketsp(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("学打篮球");
    }
}
