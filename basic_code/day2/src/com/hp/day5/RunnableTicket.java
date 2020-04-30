package com.hp.day5;

public class RunnableTicket implements Runnable {
    private static int ticket = 100;
    Object obj = new Object();
//    @Override
//    public void run() {
//        while(true){
//            synchronized (obj){
//                if(ticket>0){
//                    try{
//                        Thread.sleep(10);
//                    }catch(InterruptedException e){
//                        e.printStackTrace();
//                    }
//                }
//
//                System.out.println(Thread.currentThread().getName()+"正在卖"+ticket);
//                ticket--;
//            }
//        }
//    }

    @Override
    public void run() {
        System.out.println(this);
        while (true) {
            payTickeyStatic();
        }
    }

    public static void payTickeyStatic() {
        synchronized (RunnableTicket.class) {
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
                System.out.println(Thread.currentThread().getName() + "正在卖" + ticket);
                ticket--;

            }
        }
    }

    public void payTicket() {
        synchronized (this) {
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在卖" + ticket);
                ticket--;

            }
        }
    }
}
