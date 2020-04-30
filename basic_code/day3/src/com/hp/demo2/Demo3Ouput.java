package com.hp.demo2;

import java.io.*;

public class Demo3Ouput {
    public static void main(String[] args) throws IOException {
//        write_utf_8();
//        write_gbk();
//        read_utf_8();
        read_gbk();
    }

    private static void read_gbk() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("b.txt"),"GBK");

        int len = 0;
        while ((len=isr.read())!=-1){
            System.out.println((char)len);
        }
        isr.close();


    }

    private static void read_utf_8() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));

        int len =0 ;
        while ((len=isr.read())!=-1){
            System.out.println((char)len);
        }
        isr.close();
    }

    private static void write_gbk() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"),"GBK");
        osw.write("你好");
        osw.close();


    }

    private static void write_utf_8() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"));
        osw.write("你好");
        osw.close();
    }
}
