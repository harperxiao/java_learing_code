package com.hp.day3;

public class Boostrap {
    public static void main(String[] args) {
        MyRed red = new MyRed("课程");
        red.setOwnerName("王思聪");

        RandomMode random = new RandomMode();
        red.setOpenWay(random);


    }
}
