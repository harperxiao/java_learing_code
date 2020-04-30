package com.hp.demo3;

import java.util.function.Function;

public class Demo10Function {
    public static void main(String[] args) {
        String s = "赵丽颖,20";
        int num = change(s, (s1) -> s.split(",")[1], (s2) -> Integer.parseInt(s2), (s3) -> s3 + 100);
        System.out.println(num);
    }

    public static int change(String s, Function<String, String> fun1,
                             Function<String, Integer> fun2, Function<Integer, Integer> fun3) {
        //使用andThen方法把三个转换组合到一起
        return fun1.andThen(fun2).andThen(fun3).apply(s);
    }
}
