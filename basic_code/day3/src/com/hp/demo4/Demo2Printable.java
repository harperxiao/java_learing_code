package com.hp.demo4;

public class Demo2Printable {
    public static void main(String[] args) {
        printString(s -> {
            MethodReeObject obj = new MethodReeObject();
            obj.printUpperCaseString(s);
        });
    }
    public static void printString(Printable p){
        p.print("Hello");
    }

}
