package com.it;

public class objectsapiclone {

    public static void main(String[] args) throws CloneNotSupportedException {
        cloneUser u1 = new cloneUser("张三",1001,new int[]{1,2,3});
        //System.out.println(u1);
        cloneUser u2 = (cloneUser) u1.clone();
        u2.setArr(new int[]{4,5,6});
        System.out.println(u1);
        System.out.println(u2);
    }
}
