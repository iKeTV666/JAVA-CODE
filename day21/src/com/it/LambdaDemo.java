package com.it;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo {
    public static void main(String[] args) {
        String[] arr = {"abc","b","bc","abcd"};
        Arrays.sort(arr,(o1, o2)-> o1.length()-o2.length());
        System.out.println(Arrays.toString(arr));
    }
}
