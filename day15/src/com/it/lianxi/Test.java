package com.it.lianxi;

public class Test {
    public static void main(String[] args) {
        pingpangsp sp = new pingpangsp("张三", 18);
        sp.learn();
        sp.speak();
        pingpangtc tc = new pingpangtc("李四", 20);
        tc.teach();
        tc.speak();
        basketsp bs = new basketsp("王五", 22);
        bs.learn();
        baskettc tc2 = new baskettc("赵六", 24);
        tc2.teach();
    }
}
