package com.hp.day2;

import java.util.Random;

public class Demo3Random {

    public static void main(String[] args) {
        Random r = new Random();

        int i = r.nextInt();
        System.out.println(i);

        int a = r.nextInt(10);
        System.out.println(a);


    }
}
