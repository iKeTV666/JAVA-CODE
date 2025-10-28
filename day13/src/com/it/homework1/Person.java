package com.it.homework1;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String nationality;

    public Person() {
    }

    public Person(String name, int age, String gender, String nationality) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * 设置
     * @param nationality
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void eat(){
        System.out.println("正在吃饭");
    }
    public void sleep(){
        System.out.println("正在睡觉");
    }
    public void work1(){
        System.out.println("正在工作");
    }
}
