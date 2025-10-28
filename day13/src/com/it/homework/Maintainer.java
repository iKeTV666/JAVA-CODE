package com.it.homework;

public class Maintainer extends AdminStaff{
     public Maintainer() {
     }

     public Maintainer(String id, String name, String job) {
         super(id, name, job);
     }
     @Override
     public void work(){
         super.work();
         System.out.println("维护");
     }
}
