package com.hp.demo3;

import java.util.function.Supplier;

public class Demo5Supplier {
    public static void main(String[] args) {
//        System.out.println(getString(()->"虎哥"));

        int[] arr = {100,0,-50,880,99,33,-30};
        int maxValue = getMax(()->{
            int max = arr[0];
            for (int i : arr) {
                if (i>max){
                    max=i;
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }
    public  static String getString(Supplier<String> suo){
        return suo.get();
    }
    public static int getMax(Supplier<Integer> arr){return arr.get();}
}
