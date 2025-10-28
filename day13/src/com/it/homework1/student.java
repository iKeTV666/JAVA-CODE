package com.it.homework1;

public class student extends Person{
    private String school;
    private String stuNumber;

    public student() {
    }

    public student(String name, int age, String gender, String nationality, String school, String stuNumber) {
        super(name, age, gender, nationality);
        this.school = school;
        this.stuNumber = stuNumber;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }
    @Override
    public void work1() {
        System.out.println("我是学生，我在学习");
    }
}
