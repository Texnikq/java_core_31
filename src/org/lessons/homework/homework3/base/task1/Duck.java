package org.lessons.homework.homework3.base.task1;

public class Duck implements Flying {
    private boolean isInjured;

    public void toFly(){
        System.out.println("утка летит");
    }


    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public boolean isInjured() {
        return isInjured;
    }
}
