package com.it.homework1;

public class StudentLeader extends student{
    private String job;

    public StudentLeader() {

    }

    public StudentLeader(String name, int age, String gender, String nationality, String school, String stuNumber, String job) {
        super(name, age, gender, nationality, school, stuNumber);
        this.job = job;
    }
    public void meeting() {
        System.out.println("喜欢开会");
    }
}
