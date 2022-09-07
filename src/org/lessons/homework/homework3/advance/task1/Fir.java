package org.lessons.homework.homework3.advance.task1;

public class Fir implements Tree{
    @Override
    public void hasCone() {
        System.out.println("Имеет шишки");
    }

    @Override
    public void canSmell() {
        System.out.println("Умеет пахнуть");

    }
}
