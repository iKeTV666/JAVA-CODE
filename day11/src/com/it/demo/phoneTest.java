package com.it.demo;

import java.util.ArrayList;

public class phoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 2999);
        Phone p3 = new Phone("oppo", 29999);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> list1 = phoneInfo(list);
        for (int i = 0; i < list1.size(); i++) {
            Phone p = list1.get(i);
            System.out.println(p.getName() + " " + p.getPrice());
        }

    }
        public static ArrayList<Phone> phoneInfo(ArrayList<Phone> list){
            ArrayList<Phone> list1 = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                Phone p = list.get(i);
                if (p.getPrice() < 3000) {
                    list1.add(p);
                }
            }
            return list1;
        }
    }

