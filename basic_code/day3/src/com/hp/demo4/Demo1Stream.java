package com.hp.demo4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo1Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        list.stream()
                .filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));


        Stream<String> s = Stream.of("1", "2", "3", "4");
//        s.map(a->Integer.parseInt(a)).forEach(i-> System.out.println(i));
//        s.limit(3).forEach(name-> System.out.println(name));
//        s.skip(2).forEach(name-> System.out.println(name));

        Stream<String> concat = Stream.concat(list.stream(), s);
        concat.forEach(name-> System.out.println(name));

    }
}
