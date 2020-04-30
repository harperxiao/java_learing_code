package com.hp.day3;

public class Demo5MathPractice {
    public static void main(String[] args) {
        int low = (int) Math.ceil(-10.8);
        int up = (int) Math.floor(5.9);
        int count = 0;
        for (int i = low; i < up + 1; i++) {
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                count += 1;
            }
        }
        System.out.println(count);

    }
}
