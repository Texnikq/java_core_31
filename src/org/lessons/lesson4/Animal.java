package org.lessons.lesson4;

public abstract class Animal {
    private int teethCount;

    public Animal(int teethCount) {
        this.teethCount = teethCount;
    }

    public int getTeethCount() {
        return teethCount;
    }

    //    private String name;
//
//    public Animal(String name) {
//        this.name = name;
//    }
//
  public abstract void makeSound();


//    public void makeSound() {
//        if (this.name.equals("Тигр")) {
//            System.out.println("рычит");
//        } else if (this.name.equals("Лошадь")) {
//            System.out.println("ржет");
//
//        }
//    }

//    public void hunt() {
//        if (this.name.equals("Тигр")) {
//            System.out.println("Тигра градется");
//        }
//    }
//    public void rideHuman() {
//        if (this.name.equals("Лошадь")) {
//            System.out.println("Лошадь катает человека");
//        }
//    }

}



