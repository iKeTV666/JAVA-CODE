package com.it.demo;

public class demo12 {
    public static void main(String[] args) {
        String a = "asdfgh";
        String b = "fghasd";
        boolean result = match(a,b);
        System.out.println(result);
    }


    public static boolean match(String a, String b){
        boolean flag = false;
        int num = a.length();
        int count = 0;
        while (true) {
            String str = "";
            String start = a.substring(1);
            String end = a.substring(0,1);
            str = start + end;
            if(str.equals(b)){
                flag = true;
                break;
            }
            count++;
            a = str;
            if(count == num){
                break;
            }
        }
        return flag;
    }
}
