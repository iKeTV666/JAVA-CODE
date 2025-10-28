package com.it.duotai;

public class Person {
    private String name;
    private int age;
    public Person(){

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void keepPet(animal a, String something, Person p) {
        if (a instanceof Dog dog) {
            System.out.println("年龄为" + p.getAge() + "的" + p.getName() + "养了一只" + dog.getAge() + "岁的" + dog.getColor() + "的狗");
            dog.eat(something);
        } else if (a instanceof Cat cat) {
            System.out.println("年龄为" + p.getAge() + "的" + p.getName() + "养了一只" + cat.getAge() + "岁的" + cat.getColor() + "的猫");
            cat.eat(something);
        }
    }
}
