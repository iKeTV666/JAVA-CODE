package com.it;

import java.util.ArrayList;
import java.util.Collection;

public class forDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        for (String s : coll) {
            System.out.println(s);
        }
    }
}
