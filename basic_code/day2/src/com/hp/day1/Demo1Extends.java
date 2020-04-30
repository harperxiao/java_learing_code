package com.hp.day1;

public class Demo1Extends {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.num);
        System.out.println(fu.numFu);

        Zi zi = new Zi();
        System.out.println(zi.num);
        System.out.println(zi.numFu);

        zi.methodZi();
        zi.methodFu();

        fu.methodFu();
        System.out.println("________________");




    }
}
