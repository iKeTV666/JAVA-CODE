package com.it.demo;

public class demo7 {
    public static void main(String[] args) {
        String num = "360203200412022512";
        //System.out.println(num.length());
        String str = num.substring(6,14);
        String info = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == 4){
                info = info + "年";
            }
            if (i == 6){
                info = info + "月";
            }
            info = info + c;
            //System.out.print(c);
        }
        String newInfo = info + "日";
        System.out.println(newInfo);
        int sex = num.charAt(16) - '0';
        if(sex % 2 == 0){
            System.out.println("女");
        }else{
            System.out.println("男");
        }
    }
}
