package com.hp.demo3;

public class Demo1 {
    public static void main(String[] args) {
        show(new MyFunctionalInterface(){
            @Override
            public void method() {
                System.out.println("匿名内部类");
            }
        });
        show(()-> System.out.println("使用lambda"));
    }

    private static void show(MyFunctionalInterface myFunctionalInterface) {
        myFunctionalInterface.method();
    }
}
