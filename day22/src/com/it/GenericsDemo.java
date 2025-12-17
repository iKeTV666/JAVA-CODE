package com.it;

public class GenericsDemo {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        System.out.println(list);
    }
}
