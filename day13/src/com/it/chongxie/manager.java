package com.it.chongxie;

public class manager extends staff{
    int bonus;
     public manager() {
     }

    public manager(String id, String name, int money, int bonus) {
        super(id, name, money);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work(){
        super.work();
        System.out.println("管理员工");
    }
}
