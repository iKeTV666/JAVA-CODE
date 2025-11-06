package com.it;

public class IntegerDemo1 {
    public static void main(String[] args) {
        String str1 = Integer.toBinaryString(100);
        System.out.println(str1);
        String str2 = Integer.toHexString(100);
        System.out.println(str2);
        String str3 = Integer.toOctalString(100);
        System.out.println(str3);
        //将字符串类型的数据转为整数
        int i1 = Integer.parseInt("100");
        System.out.println(i1);
        System.out.println(i1 + 1);
    }
}
