package com.hp.day2;

import java.util.ArrayList;
import java.util.Random;

public class Demo7ArrayListReturn {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> bigList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            bigList.add(num);

        }
        ArrayList<Integer> smallList = findSmall(bigList);
        for (Integer num : smallList) {
            System.out.println(num);
        }

    }

    private static ArrayList<Integer> findSmall(ArrayList<Integer> bigList) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (Integer num : bigList) {
            if (num % 2 == 0) {
                smallList.add(num);
            }
        }
        return smallList;
    }
}
