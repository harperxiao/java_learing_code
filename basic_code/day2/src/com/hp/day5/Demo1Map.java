package com.hp.day5;

import java.util.HashMap;
import java.util.Map;

public class Demo1Map {
    public static void main(String[] args) {
//        show1();
//        show2();
//        show3();
        show4();
    }

    private static void show4() {
        Map<String, String> map = new HashMap<>();
        map.put("小一","小二");
        map.put("小一","小四");
        map.put("小三","小二");
        for (String key : map.keySet()) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);

        }
    }

    private static void show3() {
        HashMap<String, String> map = new HashMap<>();
        map.put("小一","小二");
        map.put("小一","小四");
        map.put("小三","小二");
        System.out.println(map.containsKey("小一"));
    }

    private static void show2() {
        HashMap<String, String> map = new HashMap<>();
        map.put("小一","小二");
        map.put("小一","小四");
        map.put("小三","小二");
        map.remove("小一");
        System.out.println(map);
    }

    private static void show1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("小一","小二");
        map.put("小一","小四");
        map.put("小三","小二");
        System.out.println(map);
    }
}
