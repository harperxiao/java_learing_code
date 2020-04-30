package com.hp.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo10Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1,1,3,2);
//        Collections.sort(list1);
//        System.out.println(list1);
        Collections.sort(list1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(list1);
        ArrayList<Person> list02 = new ArrayList<>();
        list02.add(new Person("a迪丽热巴",18));
        list02.add(new Person("古力娜扎",20));
        list02.add(new Person("杨幂",17));
        list02.add(new Person("b杨幂",18));
        System.out.println(list02);

        Collections.sort(list02, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int i = o1.getAge() - o2.getAge();
                if (i==0){
                    return o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return i;
            }
        });
        System.out.println(list02);
    }
}
