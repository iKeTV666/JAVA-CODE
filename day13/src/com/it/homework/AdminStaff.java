package com.it.homework;

public class AdminStaff extends Employee{
     public AdminStaff() {
     }

     public AdminStaff(String id, String name, String job) {
         super(id, name, job);
     }
     @Override
     public void work(){
         super.work();
        System.out.println("行政工作");
     }
}
