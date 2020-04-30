package com.hp.day5;

public class Demo1WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(){
            @Override
            public void run() {
                while(true){
                    synchronized (obj){
                        System.out.println("告知老板要的包子的种类和数量");
                        try{
                            obj.wait();
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                        System.out.println("包子已经做好了,开吃!");
                        System.out.println("-------------");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while(true){
                    try{
                        Thread.sleep(5000);//花5秒钟做包子
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized (obj){

                        System.out.println("老板5秒钟之后做好包子,告知顾客,可以吃包子了");
                        obj.notify();
                    }
                }
            }
        }.start();

    }
}
