package com.hp.demo1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo2Properties {
    public static void main(String[] args) throws IOException {
//        show1();
        show2();
    }

    private static void show2() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("a.txt"));

        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);
        }
    }

    private static void show1() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("赵丽颖","168");
        prop.setProperty("迪丽热巴","165");
        prop.setProperty("古力娜扎","160");

        Set<String> strings = prop.stringPropertyNames();
        for (String key : strings) {
            String value = prop.getProperty(key);
            System.out.println(key + "="+value);
        }

        FileWriter fw = new FileWriter("a.txt");
        prop.store(fw,"");
        fw.close();

    }
}
