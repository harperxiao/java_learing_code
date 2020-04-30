package com.hp.day3;

public class Demo1StaticField {
    public static void main(String[] args) {
        Student.room = "101";
        Student s1 = new Student("小一", 16);
        System.out.println(s1);
        System.out.println(s1.room);

        Student s2 = new Student("小二", 16);
        System.out.println(s2);
        System.out.println(s2.room);

    }
}
