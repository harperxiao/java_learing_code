package com.hp.day2;

public class Fu {
    int num = 10;
    public void methodFu(){
        System.out.println("父类方法");
    }
    public void method(){
        System.out.println(num);
    }
    public final void method2(){
        System.out.println("最终");
    }
}
