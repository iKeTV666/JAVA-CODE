package com.it.tlias;

public class Teacher extends person{
        private String bumen;

    public Teacher() {
    }

    public Teacher(String name, int age, String bumen) {
        super(name, age);
        this.bumen = bumen;
    }

    public String getBumen() {
        return bumen;
    }

    public void setBumen(String bumen) {
        this.bumen = bumen;
    }
    public void publish(){
        System.out.println("发布课程");
    }
}
