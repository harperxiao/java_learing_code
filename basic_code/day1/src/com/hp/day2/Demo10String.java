package com.hp.day2;

import java.util.Scanner;

public class Demo10String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        countCase(str);
    }

    private static void countCase(String str) {
        int upper = 0;
        int lower = 0;
        int number = 0;
        int ohter = 0;
        for (char o : str.toCharArray()) {
            if (o >= 'A' && o <= 'Z') {
                upper += 1;
            } else if (o >= 'a' && o <= 'z') {
                lower += 1;
            } else if (o >= '0' && o <= '9') {
                number += 1;
            } else {
                ohter += 1;
            }
        }
        System.out.println(upper + "---" + lower + "---" + number + "---" + ohter);
    }

}

