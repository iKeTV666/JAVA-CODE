package com.it.demo;

public class Manager {
    private String name;
    private int id;
    private int salary;
    private int bonus;
    public Manager(){
    }
    public Manager(String name, int id, int salary, int bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public void setBonus(int bonus){
        this.bonus = bonus;
    }
    public int getBonus(){
        return bonus;
    }
    public void work(){
        System.out.println("我是" + name + "，我是经理，我负责管理员工");
    }
}
