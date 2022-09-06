package org.lessons.homework.homework2.advance.task2;

public abstract class Car {
    //Задача №2 (Прочитать про полиморфизм и instanceof)
    //Дано: у нас есть две модели машин - жигули и toyota. Каждая из этих машин умеет: начинать движение,
    //останавливаться, включать фары. У жигули есть особенность: она ломается. У Toyota особенность: включает музыку
    //Необходимо:
    public void start() {
        System.out.println("Машина начала движение");
    }
    public void stop() {
        System.out.println("Машина начала останавливаться");
    }
    public void onLight() {
        System.out.println("Машина включила фары");
    }
}
