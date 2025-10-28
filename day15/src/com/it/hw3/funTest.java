package com.it.hw3;

public class funTest {
    public static void main(String[] args) {
        Fun f = new Fun() {
            @Override
            public void fun() {
                System.out.println("fun");
            }
        };
        f.fun();
    }
}
