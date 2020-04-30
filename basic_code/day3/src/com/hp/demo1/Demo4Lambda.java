package com.hp.demo1;

import java.util.Arrays;

public class Demo4Lambda {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("柳岩",38),
                new Person("迪丽热巴",18),
                new Person("古力娜扎",19)
        };
        Arrays.sort(arr,(o1, o2) -> o1.getAge()-o2.getAge());
        System.out.println(Arrays.toString(arr));
    }
}
