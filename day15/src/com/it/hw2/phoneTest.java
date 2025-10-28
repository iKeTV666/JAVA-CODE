package com.it.hw2;

public class phoneTest {
    public static void main(String[] args) {
        phone p = new newPhone();
        usePhone(p);
    }


    public static void usePhone(phone p){
        p.call();
        p.sendMessage();
        if (p instanceof Iplay){
             Iplay np = new newPhone();
             np.play();
        }
    }
}
