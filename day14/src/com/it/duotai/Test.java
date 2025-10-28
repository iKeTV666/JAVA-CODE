package com.it.duotai;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("老王", 30);
        animal a1 = new Dog(2, "黄色");
        Person p2 = new Person("老李", 40);
        animal a2 = new Cat(1, "黑色");
        p1.keepPet(a1, "骨头", p2);
        p2.keepPet(a2, "鱼", p2);
    }
}
