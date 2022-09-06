package org.lessons.homework.homework2.expert.task2;

public class Car {
    private double price;

    public Car(double price) {
        this.price = price;
    }

    public void showPrice() throws Exception {
        if(this.price<0){
            throw new Exception("Цена меньше 0");
        }
        System.out.println("Цена " + this.price);
    }


}
