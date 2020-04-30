package com.hp.demo1;

public class Demo2Lambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();

        new Thread(()-> System.out.println("线程创建")).start();
    }
}
