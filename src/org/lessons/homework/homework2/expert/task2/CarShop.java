package org.lessons.homework.homework2.expert.task2;

public class CarShop {
    private Car car;

    public CarShop(Car car) {
        this.car = car;
    }
    public void sellCar() {
        System.out.println("Здравствуй клиент, цена этого авто ");
        try {
            car.showPrice();
            System.out.println("Хочешь купить авто?");
        } catch (Exception e) {
            System.out.println("Неизвестна мне");
            System.out.println("Давайте посмотрим другое авто?");
        }

    }
}
