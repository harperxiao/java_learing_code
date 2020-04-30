package com.hp.day2;

import java.util.Arrays;

public class Demo5 {


    public static void main(String[] args) {

        Person[] people = new Person[3];

        Person one = new Person("小一",18);
        Person two = new Person("小二",18);
        Person three = new Person("小三",18);

        people[0] = one;
        people[1] = two;
        people[2] = three;

        System.out.println(Arrays.toString(people));

    }
}
