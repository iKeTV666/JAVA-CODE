package com.it.demo;

public class gameTest {
    public static void main(String[] args) {
        game g1 = new game("张三", 100,'男');
        game g2 = new game("李四", 100,'女');
        g1.gamerInfo();
        g2.gamerInfo();
        while (true){
            g1.atk(g2);
            if (g2.getHp() == 0){
                System.out.println(g2.getName() + "被" + g1.getName() + "打败了");
                break;
            }
            g2.atk(g1);
            if (g1.getHp() == 0){
                System.out.println(g1.getName() + "被" + g2.getName() + "打败了");
                break;
            }
        }
    }
}
