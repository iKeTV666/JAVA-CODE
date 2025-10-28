package com.it.chongxie;

public class cooker extends staff{
    public cooker() {
    }

    public cooker(String id, String name, int money) {
        super(id, name, money);
    }

    @Override
     public void work(){
         super.work();
         System.out.println("做饭");
     }
}
