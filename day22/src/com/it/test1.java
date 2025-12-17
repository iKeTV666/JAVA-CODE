package com.it;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ListUtil.addAll(list,100,200,300,400);
        System.out.println(list);
    }
}
