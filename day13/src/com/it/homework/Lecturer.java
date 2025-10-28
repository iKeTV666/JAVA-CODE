package com.it.homework;

public class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(String id, String name, String job) {
        super(id, name, job);
    }
    @Override
    public void work(){
        super.work();
        System.out.println("讲师");
    }
}
