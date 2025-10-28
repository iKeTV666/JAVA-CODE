package com.it.lianxi;

public class pingpangtc extends teacher implements inter{
    public pingpangtc() {
    }

    public pingpangtc(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
