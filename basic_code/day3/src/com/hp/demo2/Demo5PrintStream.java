package com.hp.demo2;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo5PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("out.txt");
//        ps.write(97);
//        ps.println(97);
//        ps.close();

        System.setOut(ps);
        ps.close();
    }
}
