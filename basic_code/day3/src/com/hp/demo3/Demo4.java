package com.hp.demo3;

import java.util.Arrays;
import java.util.Comparator;

public class Demo4 {
    public static void main(String[] args) {
        String[] arr = {"aaa","b","cccccc","dddddddddddd"};
        Arrays.sort(arr,getComparator());
        System.out.println(Arrays.toString(arr));
    }
    public static Comparator<String> getComparator(){
        return (o1, o2) -> o2.length()-o1.length();
    }
}
