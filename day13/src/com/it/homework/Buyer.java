package com.it.homework;

public class Buyer extends AdminStaff{
     public Buyer() {
     }

     public Buyer(String id, String name, String job) {
         super(id, name, job);
     }
     @Override
     public void work(){
         super.work();
         System.out.println("购买");
     }
}
