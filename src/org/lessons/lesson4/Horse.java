package org.lessons.lesson4;

public class Horse extends Animal {
    public Horse(){
        super(25);
    }

    @Override
    public void makeSound() {
        System.out.println("Лошадь ржет");

    }
}
