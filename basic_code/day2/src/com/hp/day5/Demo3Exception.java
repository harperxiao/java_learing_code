package com.hp.day5;

import java.io.FileNotFoundException;

public class Demo3Exception {
    public static void main(String[] args) throws FileNotFoundException {
        readFile("a.txt");
    }

    private static void readFile(String s) throws FileNotFoundException {
        if(!s.equalsIgnoreCase("a.txt")){
            throw new FileNotFoundException("文件路径不对");
        }
    }
}
