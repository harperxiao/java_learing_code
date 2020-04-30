package com.hp.day4;

import java.util.Collection;
import java.util.HashSet;

public class Demo5Collection {
    public static void main(String[] args) {
        Collection<String> col1 = new HashSet<>();
        System.out.println(col1);
        col1.add("张三");
        col1.add("张三");
        col1.add("张三");
        col1.add("张三");
        System.out.println(col1);

        col1.remove("张三");
        System.out.println(col1);

        col1.add("李四");
        System.out.println(col1.contains("李四"));
        System.out.println(col1.isEmpty());
        System.out.println(col1.size());
        Object[] objects = col1.toArray();
        System.out.println(objects);

    }
}
