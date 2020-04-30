package com.hp.demo3;

import java.util.function.Consumer;

public class Demo6Consumer {
    public static void main(String[] args) {
        method("赵丽颖",(String a)->{
            String s = new StringBuffer(a).reverse().toString();
            System.out.println(s);
        });

        method1("Hello",
                (t)->{
                    String s = new StringBuffer(t).reverse().toString();
                    System.out.println(s);
                },
                (t)->{
                    System.out.println(t.toLowerCase());
                });

    }
    public static void method(String name, Consumer<String> con){con.accept(name);}

    public static void method1(String s,Consumer<String> con1,Consumer<String> con2){
        con1.andThen(con2).accept(s);
    }

}
