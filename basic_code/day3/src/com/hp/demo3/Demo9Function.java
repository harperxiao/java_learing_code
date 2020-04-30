package com.hp.demo3;

import java.util.function.Function;

public class Demo9Function {
    public static void main(String[] args) {
        String s = "123";
        change(s,(str)->{
            return Integer.parseInt(str);
        });
        change1(s,str->Integer.parseInt(str)+10,i->i+"");
    }
    public static void change(String s, Function<String,Integer> fun){

        System.out.println(fun.apply(s));
    }
    public static void change1(String s, Function<String,Integer> fun1,Function<Integer,String> fun2){
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }
}
