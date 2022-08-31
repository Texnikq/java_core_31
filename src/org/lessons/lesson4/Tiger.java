package org.lessons.lesson4;

public class Tiger extends Animal {
    public Tiger() {
        super(40);
    }
    public void hunt() {
        System.out.println("Тигра градется");
    }

    @Override
    public void makeSound() {
        System.out.println("Тигр рычит");

    }
}
