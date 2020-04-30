package com.hp.demo3;

public class Demo2 {
    public static void main(String[] args) {
        String str = "Hello World";
        showLog(1,()-> {
            System.out.println("不满足");
            return str;
        });
    }
    public static void showLog(int level,MessageBuider msg){
        if (level==1){
            System.out.println(msg.builderMessage());
        }
    }
}
