package com.hp.demo4;

public class Man extends Human{
    @Override
    public void sayHello() {
        System.out.println("hello,man");
    }

    public void method(Greetable g){g.greet();}

    public void show(){
        method(()->super.sayHello());
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
