package com.it.demo;

import java.util.ArrayList;

public class demo3 {
    public static void main(String[] args) {

        students stu1 = new students("张三",18);
        students stu2 = new students("李四",19);
        students stu3 = new students("王五",20);
        ArrayList<students> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        for (int i = 0; i < list.size(); i++) {
            students stu = list.get(i);
            System.out.println(stu.getName() + "的年龄是" + stu.getAge());
        }
    }
}
