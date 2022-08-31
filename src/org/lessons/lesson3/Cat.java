package org.lessons.lesson3;

public class Cat {
    private boolean isMale;
    private String color;

    public Cat(boolean isMale, String colorCat) {
        this.isMale = isMale;
        this.color = colorCat;
    }

    public void sayMeow() {
        if (isMale) {
            System.out.println("кот мяукает");
        } else {
            System.out.println("кошка мяукает");
        }
    }

    public void getColorCat() {
        System.out.println("кот " + this.color);
    }

    public String getColorCat2() {
        return color;
    }

}
