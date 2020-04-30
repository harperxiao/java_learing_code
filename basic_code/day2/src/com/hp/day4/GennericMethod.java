package com.hp.day4;

public class GennericMethod {
    public <M> void method1(M m){
        System.out.println(m);
    }
    public static <M> void method2(M m){
        System.out.println(m);
    }
}
