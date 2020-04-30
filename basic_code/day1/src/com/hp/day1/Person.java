package com.hp.day1;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 100 && age > 0) {
            this.age = age;
        } else {
            System.out.println("不合理");
        }
    }

    public void sayHello(String name) {
        System.out.println("name:" + name);
        System.out.println("this.name:" + this.name);
        System.out.println(this);
    }
}
