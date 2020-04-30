package com.hp.day2;

import java.util.Random;
import java.util.Scanner;

public class Demo4RandomGame {

    public static void main(String[] args) {
        Random r = new Random();
        int guess = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("请输入要猜的数字");
            int num = sc.nextInt();
            if(num==guess){
                System.out.println("猜对了");
                break;
            }else if(num>guess){
                System.out.println("猜大了");
            }else{
                System.out.println("猜小了");
            }
        }
        System.out.println("游戏结束");
    }
}
