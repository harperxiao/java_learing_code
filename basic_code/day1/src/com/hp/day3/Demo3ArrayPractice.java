package com.hp.day3;

import java.util.Arrays;

public class Demo3ArrayPractice {
    public static void main(String[] args) {
        String str1 = "gbshfwibkahiudne";
        char[] chars = str1.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length-1; i > -1 ; i--) {
            System.out.println(chars[i]);
        }
    }
}
