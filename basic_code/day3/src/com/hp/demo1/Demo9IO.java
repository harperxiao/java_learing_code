package com.hp.demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo9IO {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("F:\\学习资料\\代码\\02-java进阶\\day09_字节流、字符流\\img\\1_io.jpg");
        FileOutputStream fos = new FileOutputStream("F:\\学习资料\\代码\\02-java进阶\\day09_字节流、字符流\\img\\1.jpg");
        byte[] bytes = new byte[1024];

        int len=0;
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时:"+(e-s)+"毫秒");


    }
}
