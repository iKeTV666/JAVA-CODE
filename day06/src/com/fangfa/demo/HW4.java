package com.fangfa.demo;

import com.sun.jdi.PathSearchingVirtualMachine;

public class HW4 {
    public static void main(String[] args) {
        double a = 10.0;
        double b = -20.0;
        double c = 30.0;
        System.out.println(method(a));
        System.out.println(method(b));
        System.out.println(method(c));
    }


    public static double method(double a){
        if (a < 0){
            return -a;
        }else {
            return a;
        }
    }
}
