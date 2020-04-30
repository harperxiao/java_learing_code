package com.hp.day1;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void show(){
        System.out.println("我是一只猫");
    }

    @Override
    public void sleep() {

    }
}
