package com.it.demo;

public class girlFriend1 {
    private String name;
    private int height;
    private int weight;
    public girlFriend1() {
    }
    public girlFriend1(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void wash() {
        System.out.println("帮我洗衣服");
    }
    public void cook() {
        System.out.println("帮我做饭");
    }
    public void show() {
        System.out.println("女朋友是" + name + "，我身高" + height + "cm，我体重" + weight + "kg");
    }
}
