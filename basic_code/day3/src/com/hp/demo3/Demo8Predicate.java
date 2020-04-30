package com.hp.demo3;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo8Predicate {
    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };
        ArrayList<String> list = filter(array, (s) -> {
            return s.split(",")[1].equals("女");
        }, (s) -> {
            return s.split(",")[0].length() == 4;
        });

        for (String s : list) {
            System.out.println(s);
        }

    }

    public static ArrayList<String> filter(String[] arr, Predicate<String> p1,Predicate<String> p2){
        ArrayList<String> list = new ArrayList<>();

        for (String s : arr) {
            boolean b = p1.and(p2).test(s);
            if (b){
                list.add(s);
            }
        }
        return list;
    }
}
