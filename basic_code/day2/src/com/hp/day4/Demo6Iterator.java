package com.hp.day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo6Iterator {
    public static void main(String[] args) {
        ArrayList<String> coll = new ArrayList<>();
        coll.add("姚明");
        coll.add("科比");
        coll.add("麦迪");
        coll.add("詹姆斯");
        coll.add("艾弗森");
        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
