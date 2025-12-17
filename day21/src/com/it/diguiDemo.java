package com.it;

public class diguiDemo {
    public static void main(String[] args) {

    }
    public static int jieCheng(int a){
        if(a==1){
            return 1;
        }
            return a * jieCheng(a - 1);
    }
}
