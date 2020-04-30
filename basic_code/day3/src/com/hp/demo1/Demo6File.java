package com.hp.demo1;

import java.io.File;
import java.io.IOException;

public class Demo6File {
    public static void main(String[] args) throws IOException {
//        String pathSeparator = File.pathSeparator;
//        System.out.println(pathSeparator);
//        String separator = File.separator;
//        System.out.println(separator);
//        show1();
//        show2("d:\\","a.txt");
//        show3();
//        show4();
//        show5();
//        show6();
        show7();
    }

    private static void show7() {
        File a = new File("aaa");
        for (File file : a.listFiles()) {
            System.out.println(file);
        }
        for (String file : a.list()) {
            System.out.println(file);
        }

    }

    private static void show6() throws IOException {
//        File file = new File("1.txt");
//        file.createNewFile();
//        File file1 = new File("1.txt");
//        file1.createNewFile();
        File a = new File("aaa");
        File b = new File("aaa\\bbb");
        File c = new File("bbb\\ccc");
//        a.mkdir();
//        b.mkdirs();
//        c.mkdirs();
        a.delete();
        c.delete();
    }

    private static void show5() {
        File file = new File("F:\\学习资料\\代码\\idea project\\basic_code\\basic_code.iml");
        if (file.exists()){
            System.out.println(file.isDirectory());
            System.out.println(file.isFile());
        }
    }

    private static void show4() {
        File f1 = new File("C:\\Users\\itcast\\IdeaProjects\\shungyuan\\a.txt");
        File absolutePath = f1.getAbsoluteFile();
        String path = f1.getPath();
        String name = f1.getName();
        System.out.println(absolutePath);
        System.out.println(path);
        System.out.println(name);

        File f2 = new File("a.txt");
        String absolutePath1 = f2.getAbsolutePath();
        String path1 = f2.getPath();
        String name1 = f2.getName();
        System.out.println(absolutePath1);
        System.out.println(path1);
        System.out.println(name1);
    }

    private static void show3() {
        File f1 = new File("c:\\");
        File f2 = new File(f1, "a.txt");
        System.out.println(f2);
    }

    private static void show2(String s, String s1) {
        File file = new File(s, s1);
        System.out.println(file);
    }



    private static void show1() {
        File f1 = new File("C:\\Users\\itcast\\IdeaProjects\\shungyuan\\a.txt");
        File f2 = new File("C:\\Users\\itcast\\IdeaProjects\\shungyuan\\a");
        System.out.println(f1);
        System.out.println(f2);

    }
}
