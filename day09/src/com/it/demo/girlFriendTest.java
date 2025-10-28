package com.it.demo;

public class girlFriendTest {
    public static void main(String[] args) {
        girlFriend[] arr = new girlFriend[4];
        arr[0] = new girlFriend("张三", 18, "爱好", "男");
        arr[1] = new girlFriend("李四", 19, "爱好", "男");
        arr[2] = new girlFriend("王五", 20, "爱好", "男");
        arr[3] = new girlFriend("赵六", 21, "爱好", "男");
        int sumAge = 0;
        for (int i = 0; i < arr.length; i++) {
            sumAge += arr[i].getAge();
        }
        int avgAge = sumAge / arr.length;
        System.out.println("平均年龄为：" + avgAge);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getAge() < avgAge){
                System.out.println(arr[i].getName() + arr[i].getAge() + arr[i].getHobby() + arr[i].getSex());
                count++;
            }
        }
        System.out.println("低于平均年龄的有" + count + "人");
    }
}
