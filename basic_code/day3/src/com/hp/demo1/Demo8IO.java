package com.hp.demo1;

import java.io.*;

public class Demo8IO {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("a.txt");
//        fos.write(97);
//        fos.close();
//        FileOutputStream fos = new FileOutputStream("a.txt",true);
//        fos.write("你好".getBytes());
//        fos.close();

//        FileInputStream fis = new FileInputStream("a.txt");
//        int len = 0;
//        while((len=fis.read())!=-1){
//            System.out.println(len);
//        }
//        fis.close();

//        FileInputStream fis = new FileInputStream("a.txt");
//        int len = 0;
//        while((len = fis.read())!=-1){
//            System.out.println((char)len);
//        }
//        fis.close();

//        FileInputStream fis = new FileInputStream("a.txt");
//        byte[] bytes = new byte[1024];
//        int len = 0 ;
//        while ((len= fis.read(bytes))!=-1){
//            System.out.println(len);
//            System.out.println(new String(bytes,0,len));
//        }


        FileReader fr = new FileReader("a.txt");
//        int len = 0;
//        while((len = fr.read())!=-1){
//            System.out.println((char)len);
//        }
//        fr.close();


        char[] cs = new char[1024];//存储读取到的多个字符
        int len = 0;//记录的是每次读取的有效字符个数
        while((len = fr.read(cs))!=-1){
            System.out.println(new String(cs,0,len));
        }
    }
}
