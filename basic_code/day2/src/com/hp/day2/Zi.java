package com.hp.day2;

public class Zi extends Fu implements MyInterfaceMethod{
    int num = 20;
    @Override
    public void method() {
        System.out.println(num);
    }
}
