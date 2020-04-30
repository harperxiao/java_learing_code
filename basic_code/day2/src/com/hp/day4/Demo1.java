package com.hp.day4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Demo1 {
    public static void main(String[] args) throws ParseException {
        System.out.println(System.currentTimeMillis());
//        demo1();
//        demo2();
//        demo3();
//        demo4();
//        demo5();
        getAge();
    }

    private static void getAge() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期,格式:yyyy-MM-dd");
        String birthString = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parseBirth = sdf.parse(birthString);
        long birth = parseBirth.getTime();
        long time = new Date().getTime();
        long age = time - birth;
        System.out.println(age/1000/60/60/24/365);
    }

    private static void demo5() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String d = sdf.format(date);
        System.out.println(date);
        System.out.println(d);

    }

    private static void demo4() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2018-05-23 15:55:51");
        System.out.println(date);


    }

    private static void demo1() {
        Date date = new Date();
        System.out.println(date);

    }

    private static void demo2() {
        Date date = new Date(1585030593391L);
        System.out.println(date);
    }

    private static void demo3() {
        Date date = new Date();
        System.out.println(date.getTime());
    }
}
