package com.hp.demo2;

import java.io.*;

public class Demo4ObjectOutput {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
//        oos.writeObject(new Person("hp美玲",18));
//        oos.close();
//
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
        Person p = (Person) o;
        System.out.println(p);

    }
}
