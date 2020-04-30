package com.hp.day2;

public interface MyInterfaceMethod {
    public default void method(){
        System.out.println("接口默认方法");
    }
}
