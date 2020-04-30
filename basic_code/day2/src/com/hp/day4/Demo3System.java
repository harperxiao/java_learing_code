package com.hp.day4;

import java.util.Arrays;

public class Demo3System {
    public static void main(String[] args) {
//        demo1();
        demo2();
    }

    private static void demo2() {
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));
    }

    private static void demo1() {
        long s = System.currentTimeMillis();
        for (int i = 0; i <= 9999; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println((e - s) + "秒");
    }
}
