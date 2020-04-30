package com.hp.day1;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);
        Member a = new Member("A", 0);
        Member b = new Member("B", 0);
        Member c = new Member("C", 0);

        System.out.println(manager);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        ArrayList<Integer> redList = manager.sendMoney(20, 3);
        a.receive(redList);
        b.receive(redList);
        c.receive(redList);

        System.out.println(manager);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
