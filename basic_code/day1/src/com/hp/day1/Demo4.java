package com.hp.day1;

public class Demo4 {

    public static void main(String[] args) {

        Phone o = new Phone();
        System.out.println(o.getBrand());
        System.out.println(o.getPrice());
        System.out.println(o.getColor());
        System.out.println(o);

        o.setBrand("苹果");
        o.setPrice(8833.0);
        o.setColor("yello");
        System.out.println(o);

        o.call("乔布斯");

        Phone two = o;

        two.setColor("black");
        System.out.println(o);
        System.out.println(o == two);


    }
}
