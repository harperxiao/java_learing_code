package com.hp.day2;

public interface MyInterface {
    public abstract void method();

    public default void method1(){
        System.out.println("新增加的默认方法");
    }

    public static void method3(){
        System.out.println("我是静态的");
    }
}
