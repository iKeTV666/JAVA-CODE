package com.it.homework;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(String id, String name, String job) {
        super(id, name, job);
    }
    @Override
    public void work(){
        super.work();
        System.out.println("辅导");
    }
}
