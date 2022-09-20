package org.lessons.homework.homework3.advance.task2;

public class Watch {
    private boolean isBroken;

    public Watch(boolean isBroken) {


        this.isBroken = isBroken;
    }

    public void tick() throws WatchBrokenError {
        if (isBroken) {
            throw new WatchBrokenError();
        } else {
            System.out.println("Часы тикают");
        }

    }
}
