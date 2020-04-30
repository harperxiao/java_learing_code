package com.hp.demo3;

public class Demo3 {
    public static void main(String[] args) {
        startThread(()-> System.out.println(Thread.currentThread().getName()));
    }
    public static void startThread(Runnable run){
        new Thread(run).start();
    }
}
