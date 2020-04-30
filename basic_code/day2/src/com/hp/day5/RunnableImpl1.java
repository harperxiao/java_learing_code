package com.hp.day5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl1 implements Runnable {
    private int ticket = 100;
    Lock l1 = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            l1.lock();

            if (ticket>0){
                try{
                    Thread.sleep(10);
                    //票存在,卖票 ticket--
                    System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                    ticket--;
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally {
                    l1.unlock();
                }
            }
        }
    }
}
