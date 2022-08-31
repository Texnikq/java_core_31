package org.lessons.lesson4;

public class Lesson4 {
    public static void main(String[] args) {
//        Animal animal = new Animal("Лошадь");
//        animal.makeSound();
//        animal.hunt();
//        animal.rideHuman();

        Horse horse = new Horse();
        System.out.println(horse.getTeethCount());
        Tiger tiger = new Tiger();
        System.out.println(tiger.getTeethCount());
        tiger.hunt();
        tiger.makeSound();




    }


}
