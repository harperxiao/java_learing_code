package com.hp.day4;

import java.util.Calendar;
import java.util.Date;

public class Demo2Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
//        System.out.println(c);
//        demo1();
//        demo2();
//        demo3();
        demo4();
    }

    private static void demo4() {
        Calendar c = Calendar.getInstance();
        Date time = c.getTime();
        System.out.println(time);
    }

    private static void demo3() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH,-1);
        System.out.println(c.get(Calendar.MONTH));
    }

    private static void demo2() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,1996);
        c.set(Calendar.MONTH,1);
        c.set(Calendar.DATE,26);
        System.out.println(c);

    }

    private static void demo1() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);
        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }

}
