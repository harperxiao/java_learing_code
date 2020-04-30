package com.hp.day2;

public class Demo3 {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        giveMePet(animal);
    }

    private static void giveMePet(Animal animal) {
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
