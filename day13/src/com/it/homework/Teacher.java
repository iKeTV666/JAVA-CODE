package com.it.homework;

public class Teacher extends Employee{
    public Teacher() {
    }

    public Teacher(String id, String name, String job) {
        super(id, name, job);
    }
    @Override
     public void work(){
        super.work();
        System.out.println("教书");
    }
}
