package com.it;

import java.util.ArrayList;

public class serchDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        ArrayList<Integer> s = getIndex(arr, 10);
        System.out.println(s);
    }
    public static ArrayList<Integer> getIndex(int[] arr, int a) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            System.out.println("数组中没有该元素");
        }
        return list;
    }
}
