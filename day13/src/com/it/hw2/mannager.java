package com.it.hw2;

public class mannager extends emplooye{
    private double bonus;

    public mannager() {

    }

    public mannager(String name, String workNumber, double kyuryo, double bonus) {
        super(name, workNumber, kyuryo);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public void work() {
        System.out.println("正在管理");
    }
}
