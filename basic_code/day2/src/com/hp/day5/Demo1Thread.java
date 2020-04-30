package com.hp.day5;

public class Demo1Thread {
    public static void main(String[] args) {
        MyThread mt = new MyThread("旺财");
        mt.start();
        System.out.println(Thread.currentThread().getName());

    }
}
