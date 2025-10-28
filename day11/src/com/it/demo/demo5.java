package com.it.demo;

import java.util.ArrayList;

public class demo5 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User us1 = new User("zhangsan",123456,1001);
        User us2 = new User("lisi",123456,1002);
        User us3 = new User("wangwu",123456,1003);
        list.add(us1);
        list.add(us2);
        list.add(us3);
        boolean b = serchUser(list, 1005);
        if(b){
            System.out.println("用户存在");
        }else{
            System.out.println("用户不存在");
        }
    }


    public static boolean serchUser(ArrayList<User> list,int id){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            int uid = u.getId();
            if(uid == (id)){
                return true;
            }
        }
        return false;
    }
}
