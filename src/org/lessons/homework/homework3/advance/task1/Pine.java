package org.lessons.homework.homework3.advance.task1;

public class Pine implements Tree{
    @Override
    public void hasCone() {
        System.out.println("Сосна: имеет шишки");
    }

    @Override
    public void canSmell() {
        System.out.println("Сосна: умеет пахнуть");
    }
}
