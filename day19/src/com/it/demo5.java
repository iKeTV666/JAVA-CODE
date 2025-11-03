package com.it;

public class demo5 {
    public static void main(String[] args) {
        String s = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
        String result = s.replaceAll("[\\w&&[^_]]+","vs");
        String[] arr = s.split("[\\w&&[^_]]+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(result);
    }
}
