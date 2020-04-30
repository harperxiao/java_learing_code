package com.hp.day5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1Exception {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parse = sdf.parse("2020-1201");
            System.out.println(parse);
        } catch (ParseException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);
        }
    }

}
