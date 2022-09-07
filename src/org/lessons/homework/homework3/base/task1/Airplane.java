package org.lessons.homework.homework3.base.task1;

public class Airplane implements Flying {
    private int countPassengers;

    public int getCountPassengers() {
        return countPassengers;
    }

    public void toFly(){
        System.out.println("самолет летит");
    }

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }
}
