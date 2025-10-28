package com.it.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        ArrayList<students> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            students s = new students();
            System.out.println("xingming");
            String name = sc.next();
            System.out.println("nianling");
            int age = sc.nextInt();
            s.setName(name);
            s.setAge(age);
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            students stu = list.get(i);
            System.out.println(stu.getName() + " " + stu.getAge());
        }
    }
}
