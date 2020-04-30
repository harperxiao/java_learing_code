package com.hp.demo3;

import java.util.function.Predicate;

public class Demo7Predicate {
    public static void main(String[] args) {
        String s = "abcdef";

        System.out.println(checkString(s,str->str.length()>5));
        boolean b = checkString1(s, (s1) -> s1.length() > 5, (s2) -> s2.contains("a"));
        System.out.println(b);
    }
    public static boolean checkString(String s, Predicate<String> pre)
    {return pre.test(s);}

    public static boolean checkString1(String s, Predicate<String> pre,Predicate<String> pre1)
    {return pre1.and(pre).test(s);}
}
