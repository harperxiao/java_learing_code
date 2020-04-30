package com.hp.day3;

public class Demo2 {
    public static void main(String[] args) {
        new MyInterface(){
            @Override
            public void method1() {
                System.out.println("方法1");

            }

            @Override
            public void method2() {
                System.out.println("方法2");
            }
        }.method1();
    }
}
