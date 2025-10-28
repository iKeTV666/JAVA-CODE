package com.it.demo;

public class demo16 {
    public static void main(String[] args) {
        String str = "abcbac";
        String str1 = "上海自来水来自海上";
        System.out.println(equal(str));
        System.out.println(equal(str1));
    }
    public static boolean equal(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        sb.reverse();
        if(str.equals(sb.toString())){
            return true;
        }else {
            return false;
        }
    }
}
