package com.hp.day2;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗狗吃骨头");
    }
    public void watchHouse(){
        System.out.println("狗看家");
    }
}
