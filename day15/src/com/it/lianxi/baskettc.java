package com.it.lianxi;

public class baskettc extends teacher{
    public baskettc() {
    }

    public baskettc(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打篮球");
    }
}
