package com.it.hw3;

public class animalTest {
    public static void main(String[] args) {
      //创建一个人
        person p = new person("张三", 20);
        //创建一个狗
        dog d = new dog(2, "黄色");
        //创建一个猫
        cat c = new cat(1, "黄色");
        //人养狗
        p.keepPet(d, "狗粮");
        //人养猫
        p.keepCat(c, "猫粮");
    }
}
