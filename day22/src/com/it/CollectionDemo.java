package com.it;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<student> stu = new ArrayList<>();
        student s1 = new student("张三", 18);
        student s2 = new student("lisi", 19);
        student s3 = new student("wangwu", 20);
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        //stu.clear();
        stu.remove(s2);
        student s4 = new student("wangwu", 20);
        boolean b = stu.contains(s4);
        int size = stu.size();
        System.out.println(b);
        System.out.println(stu);
        System.out.println(size);
    }
}
