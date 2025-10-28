package com.it.hw3;

public class playTest {
    public static void main(String[] args) {
        Iplay ip = new Iplay() {
            @Override
            public void playGame() {
                System.out.println("playGame");
            }
        };
        ip.playGame();
    }
}
