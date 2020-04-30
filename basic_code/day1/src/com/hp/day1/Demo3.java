package com.hp.day1;

public class Demo3 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(18);
        student.setName("hphphp");
        System.out.println(student);
        student.study();
        student.test();
        Student.eat();
        Student.test();
        Student.study();

    }
}
