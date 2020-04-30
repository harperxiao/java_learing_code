package com.hp.day1;

import java.util.ArrayList;

public class Manager extends User{
    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> sendMoney(int totalMoney, int count){
        ArrayList<Integer> redList = new ArrayList<>();
        int leftMoney = this.getMoney();
        if (leftMoney<totalMoney){
            System.out.println("金额不足");
            return redList;
        }
        this.setMoney(this.getMoney()-totalMoney);
        int avg = totalMoney / count;
        int mod = totalMoney % count;
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        int last = avg+ mod;
        redList.add(last);
        return redList;


    }
}
