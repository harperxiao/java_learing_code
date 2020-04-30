package com.hp.day5;

public class Demo2Exception {
    public static void main(String[] args) {
        int[] arr = new int[3];
        getElement(arr,3);
    }

    private static void getElement(int[] arr, int i) {
        if (arr==null){
            throw new NullPointerException("数组为空");
        }
        if (i<0||i>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("数组越界");
        }
        System.out.println(arr[i]);
    }
}
