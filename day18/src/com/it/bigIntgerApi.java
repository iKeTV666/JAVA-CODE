package com.it;

import java.math.BigInteger;

public class bigIntgerApi {
    public static void main(String[] args) {
        BigInteger b1 = BigInteger.valueOf(100);
        System.out.println(b1);
        BigInteger b2 = new BigInteger("9999999999999999999999");
        System.out.println(b2);
        BigInteger b3 = BigInteger.valueOf(10);
        BigInteger b4 = BigInteger.valueOf(2);
        BigInteger b5 = b3.add(b4);
        System.out.println(b5);
        BigInteger[] arr = b3.divideAndRemainder(b4);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
