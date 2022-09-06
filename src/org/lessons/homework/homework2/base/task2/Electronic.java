package org.lessons.homework.homework2.base.task2;

public abstract class Electronic {
    private boolean isOn = false;

    public void setOn(boolean on) {
        isOn = on;
    }

    public void on(){
        this.isOn=true;

    }
    public void off(){
        this.isOn=false;

    }

    abstract void work();

}
