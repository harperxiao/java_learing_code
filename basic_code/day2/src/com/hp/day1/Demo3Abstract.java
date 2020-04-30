package com.hp.day1;

public class Demo3Abstract {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.show();
        cat.eat();

        Animal cat2 = new Cat();
        cat2.eat();
    }
}
