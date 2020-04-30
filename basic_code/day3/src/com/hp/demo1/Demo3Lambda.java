package com.hp.demo1;

public class Demo3Lambda {
    public static void main(String[] args) {
        invoke(new Cook() {
            @Override
            public void eat() {
                System.out.println("吃饭");
            }
        });
        invoke(()-> System.out.println("吃饭饭"));
    }
    public static void invoke(Cook cook){
        cook.eat();
    }
}
