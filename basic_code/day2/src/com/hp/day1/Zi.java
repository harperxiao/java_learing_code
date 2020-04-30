package com.hp.day1;

public class Zi extends Fu{
    int numZi = 20;
    int num=200;
    public void methodZi(){
        System.out.println(num);
    }

    @Override
    public void methodFu() {
        System.out.println(num);
    }
}

