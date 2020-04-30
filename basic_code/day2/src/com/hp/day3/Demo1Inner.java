package com.hp.day3;

public class Demo1Inner {
    public static void main(String[] args) {
        Body body = new Body("身体");
        body.methodBody();
        Body.Heart heart = new Body("身体").new Heart();
        heart.beat();

    }
}
