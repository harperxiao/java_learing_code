package com.hp.day2;

import java.util.Scanner;

public class Demo1Scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        System.out.println("数字" + i);

        String s = sc.next();
        System.out.println(s);

    }
}
