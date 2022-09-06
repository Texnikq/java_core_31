package org.lessons.homework.homework2.base.task1;

public class Opposum {

    private int sumFingers;
    private int bodyLength;//сантиметры

    public Opposum(int sumFingers, int bodyLength) {
        this.sumFingers = sumFingers;
        this.bodyLength = bodyLength;
    }

    public void getInfo() {
        System.out.println("Оппосум имеет " + sumFingers + " пальцев на каждой лапке.");
        System.out.println("Длина тела Оппосума " + bodyLength + " см.");
    }

    public int getBodyLength() {
        return bodyLength = 80;
    }

    public void setSumFingers(int sumFingers) {
        this.sumFingers = sumFingers;
    }
}
