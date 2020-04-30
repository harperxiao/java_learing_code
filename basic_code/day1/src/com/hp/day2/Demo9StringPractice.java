package com.hp.day2;


public class Demo9StringPractice {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        getSpecificString(array);
    }

    private static void getSpecificString(int[] array) {
        String str1 = "";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str1 += "word" + array[i];
            } else {
                str1 += "word" + array[i] + ",";
            }
        }
        str1 = "[" + str1 + "]";
        System.out.println(str1);

    }
}
