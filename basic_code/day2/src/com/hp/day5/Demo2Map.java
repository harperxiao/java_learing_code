package com.hp.day5;

import com.hp.day4.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo2Map {
    public static void main(String[] args) {
        show1();
    }

    private static void show1() {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("女王",18),"英国");
        map.put(new Person("秦始皇",18),"秦国");
        map.put(new Person("普京",30),"俄罗斯");
        map.put(new Person("女王",18),"毛里求斯");
        Set<Map.Entry<Person, String>> entries = map.entrySet();
        for (Map.Entry<Person, String> entry : entries) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
