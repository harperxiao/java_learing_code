package com.hp.day5;

public class Demo3Runnale {
    public static void main(String[] args) {
        RunnableImpl1 run = new RunnableImpl1();
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        t0.start();
        t1.start();
        t2.start();
    }
}
