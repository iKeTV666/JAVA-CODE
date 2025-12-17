package com.it;

import java.util.Arrays;
import java.util.Comparator;

public class girlDemo {
    public static void main(String[] args) {
        girlFriend gf1 = new girlFriend("gf1", 18, 160);
        girlFriend gf2 = new girlFriend("gf2", 19, 165);
        girlFriend gf3 = new girlFriend("gf3", 20, 170);
        girlFriend gf4 = new girlFriend("gf4", 20, 175);
        girlFriend a = new girlFriend("a", 20, 175);
        girlFriend[] gfs = {gf1, gf2, gf3, gf4, a};

        Arrays.sort(gfs, (o1,o2)-> {
                double temp = o1.getAge() - o2.getAge();
                if(temp == 0){
                    temp = o1.getHeight() - o2.getHeight();
                    if(temp == 0){
                        temp = o1.getName().compareTo(o2.getName());
                    }
                }
                if (temp > 0){
                    return 1;
                }else if(temp < 0){
                    return -1;
                }
                return 0;
        });


        /*Arrays.sort(gfs, new Comparator<girlFriend>() {
            @Override
            public int compare(girlFriend o1, girlFriend o2) {
                double temp = o1.getAge() - o2.getAge();
                if(temp == 0){
                    temp = o1.getHeight() - o2.getHeight();
                    if(temp == 0){
                        temp = o1.getName().compareTo(o2.getName());
                    }
                }
                if (temp > 0){
                    return 1;
                }else if(temp < 0){
                    return -1;
                }
                return 0;
            }
        });*/
        System.out.println(Arrays.toString(gfs));
       /* gfs = paixu(gfs);*//*
        for (int i = 0; i < gfs.length; i++) {
            System.out.println(gfs[i]);
        }*/
    }
   /* public static girlFriend[] paixu(girlFriend[] gfs){
        Arrays.sort(gfs, new Comparator<girlFriend>() {
            @Override
            public int compare(girlFriend o1, girlFriend o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        //如果年龄一样，按身高排序
        Arrays.sort(gfs, new Comparator<girlFriend>() {
            @Override
            public int compare(girlFriend o1, girlFriend o2) {
                if(o1.getAge() == o2.getAge()){
                    return o1.getHeight() - o2.getHeight();
                }
                return o1.getAge() - o2.getAge();
            }
        });
        //如果身高也一样，按姓名排序
        Arrays.sort(gfs, new Comparator<girlFriend>() {
            @Override
            public int compare(girlFriend o1, girlFriend o2) {
                if(o1.getAge() == o2.getAge() && o1.getHeight() == o2.getHeight()){
                    return o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return 0;
            }
        });*/

}
