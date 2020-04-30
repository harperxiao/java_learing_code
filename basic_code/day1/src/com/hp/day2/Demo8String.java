package com.hp.day2;

import java.util.Arrays;

public class Demo8String {
    public static void main(String[] args) {
        byte[] a = {97, 98, 99};
        System.out.println(new String(a));

        String str1 = "Hello";
        char[] charArray = {'h', 'e', 'l', 'l', 'o'};
        String str2 = new String(charArray);

        System.out.println(str2.equalsIgnoreCase(str1));

        System.out.println("__________________");
        String str3 = str1.concat(str2);
        System.out.println(str3);

        char ch = str1.charAt(1);
        System.out.println(str1 + "在索引1的字母为" + ch);
        System.out.println("_________________");

        int index = str1.indexOf("llo");
        System.out.println("llo第一次出现的位置" + index);
        System.out.println("_________________");


        System.out.println(str1.substring(5));
        System.out.println("_________________");
        System.out.println(str1.substring(1,2));

        char[] chars = "hello".toCharArray();
        System.out.println(Arrays.toString(chars));

        byte[] bytes = "abc".getBytes();
        System.out.println(Arrays.toString(bytes));

        String newStr = str1.replace("llo", "**");
        System.out.println(newStr);
        System.out.println("_________________");

        String[] split = "aaa,bbb,ccc".split(",");
        for (String s : split) {
            System.out.println(s);
        }

    }
}
