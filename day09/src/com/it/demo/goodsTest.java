package com.it.demo;

public class goodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];
        Goods g1 = new Goods("商品1", 100, 1, 10);
        Goods g2 = new Goods("商品2", 200, 2, 20);
        Goods g3 = new Goods("商品3", 300, 3, 30);
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId());
            System.out.println(goods.getName());
            System.out.println(goods.getPrice());
            System.out.println(goods.getNum());
        }
    }
}
