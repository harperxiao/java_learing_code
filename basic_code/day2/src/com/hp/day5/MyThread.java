package com.hp.day5;

public class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {

            System.out.println(Thread.currentThread().getName());

    }
}
