package com.it;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class bigdecimelDemo {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.09");
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);
        BigDecimal bd4 = BigDecimal.valueOf(10.0);
        BigDecimal bd5 = BigDecimal.valueOf(10.0);
        //只有传整数才是提前写好的不需要重新创建对象
        System.out.println(bd4 == bd5);
        BigDecimal bd6 = BigDecimal.valueOf(10.0);
        BigDecimal bd7 = BigDecimal.valueOf(3.0);
        BigDecimal bd8 = bd6.divide(bd7, 2, RoundingMode.HALF_UP);
        System.out.println(bd8);
    }
}
