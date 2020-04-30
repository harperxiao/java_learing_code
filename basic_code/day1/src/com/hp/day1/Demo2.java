package com.hp.day1;

import java.util.Arrays;

public class Demo2 {

    public static void main(String[] args) {

        int[] arrayA = new int[]{5, 15, 25, 40};
        int[] arrayB = {10, 20, 30};
        int[] arrayC;
        arrayC = new int[] {10,11};

        for (int i : arrayA) {
            System.out.println(i);
        }

        int length = arrayA.length;
        System.out.println(length);

        System.out.println("____________");
        System.out.println(Arrays.toString(arrayA));


    }

}
