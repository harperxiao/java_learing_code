package com.hp.demo1;

public class Demo5Lambda {
    public static void main(String[] args) {
        invokeCal(120,110,(a,b)->a+b);

    }
    public static void invokeCal(int a,int b,Cal cal){
        System.out.println(cal.cal(a,b));
    }
}
