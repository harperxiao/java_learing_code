package com.hp.demo2;

import java.io.*;

public class Demo1Buffer {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("a.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//        bos.write("我把数据写入到内部缓冲区中".getBytes());
//        bos.close();
//        fos.close();


//        FileInputStream fis = new FileInputStream("a.txt");
//        BufferedInputStream bis = new BufferedInputStream(fis);
//
//        byte[] bytes = new byte[1024];
//        int len = 0;
//        while ((len=bis.read(bytes))!=-1){
//            System.out.println(new String(bytes,0,len));
//        }
//        bis.close();


//        BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
//        for (int i = 0; i < 10; i++) {
//            bw.write("hello");
//            bw.newLine();
//
//        }
//        bw.close();


        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
