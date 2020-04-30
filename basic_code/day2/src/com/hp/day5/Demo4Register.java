package com.hp.day5;

import com.sun.deploy.association.RegisterFailedException;

import java.util.Scanner;

public class Demo4Register {
    static String[] usernames = {"zhangsan","lisi","wangwu"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String str = sc.next();
        findUser(str);
    }

    private static void findUser(String str) {
        for (String username : usernames) {
            if (str.equals(username)){
                try {
                    throw new RegisterException("该用户名已被注册");
                }catch (RegisterException e){
                    e.printStackTrace();
                    return;
                }
            }
        }
        System.out.println("注册成功");
    }
}
