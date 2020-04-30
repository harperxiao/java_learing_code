package com.hp.day4;

public class Demo7Generic {
    public static void main(String[] args) {
        GennericMethod gm = new GennericMethod();
        gm.method1("abc");
        gm.method1(100);
        GenericClass<String> gc = new GenericClass<>();
        gc.setName("hphp");
        System.out.println(gc.getName());
    }
}
