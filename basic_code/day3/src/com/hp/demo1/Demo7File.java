package com.hp.demo1;

import java.io.File;

public class Demo7File {
    public static void main(String[] args) {
        File file = new File("F:\\学习资料\\代码\\idea project\\basic_code");
        getAllFile(file);
    }

    private static void getAllFile(File file) {
        File[] files = file.listFiles(new FileFilterImpl());
        for (File f : files) {
            if (f.isDirectory()){
                getAllFile(f);
            }else{
                System.out.println(f);
            }
        }
    }
}
