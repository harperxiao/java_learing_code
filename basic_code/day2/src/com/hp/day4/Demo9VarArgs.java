package com.hp.day4;

public class Demo9VarArgs {
    public static void main(String[] args) {
        add(10,20);
        add(10,10,10);
    }
    private static void add(int...arr){
        int sum = 0 ;
        for (int i : arr) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
