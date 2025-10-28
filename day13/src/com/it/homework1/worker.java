package com.it.homework1;

public class worker extends Person{
    private String unit;
    private int workAge;

    public worker() {

    }

    public worker(String name, int age, String gender, String nationality, String unit, int workAge) {
        super(name, age, gender, nationality);
        this.unit = unit;
        this.workAge = workAge;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }
    @Override
    public void work1() {
        System.out.println("盖房子");
    }
}
