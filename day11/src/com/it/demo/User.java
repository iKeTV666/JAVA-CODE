package com.it.demo;

public class User {
    private String name;
    private int password;
    private int id;
     public User() {
    }
    public User(String name, int password, int id) {
        this.name = name;
        this.password = password;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
