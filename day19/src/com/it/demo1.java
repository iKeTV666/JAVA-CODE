package com.it;

public class demo1 {
    public static void main(String[] args) {
        String regex1 = "\\w{4,16}";
        String regex2 = "[1-9]\\d{16}[0-9Xx]";
        String regex3 = "[1-9]\\d{5}(19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[0-1])\\d{3}[0-9Xx]";
        //只忽略bc的大小写
        String regex4 = "a(?i)bc";
        System.out.println("abc".matches(regex4));
        System.out.println("aBc".matches(regex4));
        System.out.println("AbC".matches(regex4));
        String regex5 = "a((?i)b)c";
        //(?i)b 忽略b的大小写
        System.out.println("Abc".matches(regex5));
        System.out.println("aBc".matches(regex5));
        System.out.println("AbC".matches(regex5));
    }
}
