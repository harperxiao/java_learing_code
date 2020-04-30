package com.hp.demo1;

import java.io.FileWriter;
import java.io.IOException;

public class Demo1Writer {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("a.txt",true);
            for (int i = 0; i < 10; i++) {
                fw.write("Hello World"+"\r\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fw!=null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
