package com.it.tlias;

public class student extends person{
    private String className;
    public student() {
    }

    public student(String name, int age, String className) {
        super(name, age);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    public void fillForm(){
        System.out.println("填写听课反馈");
    }
    }

