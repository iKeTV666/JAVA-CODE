package com.it;

public class IntegerDemo {
    public static void main(String[] args) {
        //jdk5之前的写法
        Integer i1 = new Integer(1);
        Integer i2 = new Integer("2");
        //System.out.println(i1 == i2);
        int sum = i1.intValue() + i2.intValue();
        Integer i3 = new Integer(sum);
        System.out.println(i3);
        //jdk5之后的写法
        Integer i4 = 100;
        Integer i5 = 200;
        int i6 = i4 + i5;
        System.out.println(i6);
    }
}
