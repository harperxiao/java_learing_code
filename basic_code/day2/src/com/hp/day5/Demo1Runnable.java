package com.hp.day5;

public class Demo1Runnable {
    public static void main(String[] args) {
//        RunnableImpl run = new RunnableImpl();
//        Thread t = new Thread(run);
//        t.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程执行");
            }
        }).start();
    }
}
