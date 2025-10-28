package com.it.lianxi;

public abstract class teacher extends person{
    public teacher() {
    }

    public teacher(String name, int age) {
        super(name, age);
    }
    public abstract void teach();
}
