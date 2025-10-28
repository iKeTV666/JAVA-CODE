package com.it.demo;

import java.util.ArrayList;

public class studentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三", 180, "男");
        Student stu2 = new Student("李四", 19, "女");
        Student stu3 = new Student("王五", 20, "男");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        System.out.println(ArrayUtil.getMax(list));
    }
}
