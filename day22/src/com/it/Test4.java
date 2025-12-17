package com.it;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        //ArrayList<taidiDog> list1 = new ArrayList<>();
        ArrayList<lihuaCat> list2 = new ArrayList<>();
        //list1.add(new taidiDog("泰迪", 1));
        lihuaCat cat = new lihuaCat();
        cat.setName("狸花猫");
        cat.setAge(2);
        list2.add(cat);
        //keepPet(list1);
        keepPet(list2);
    }

    public static void keepPet(ArrayList<? extends Cat> list){
        for (Cat cat : list) {
            cat.eat();
        }
    }
}
