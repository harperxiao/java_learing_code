package com.hp.day2;

import java.util.ArrayList;

public class Demo6ArrayList {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        Person p1 = new Person("小一", 18);
        Person p2 = new Person("小一", 19);
        Person p3 = new Person("小一", 20);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        System.out.println(people);


        System.out.println("——————————————————————");

        Person remove = people.remove(1);
        System.out.println(remove);
        System.out.println(people);
        System.out.println("集合的长度"+people.size());

        for (Person person : people) {
            System.out.println(person);
        }

    }
}
