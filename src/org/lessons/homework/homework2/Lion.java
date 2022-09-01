package org.lessons.homework.homework2;

public class Lion {
    private int sumPaws;
    private String favoriteFood;


    public Lion(int sumPaws, String favoriteFood) {
        this.favoriteFood = favoriteFood;
        this.sumPaws = sumPaws;
    }

    public String getFavoriteFood() {
        return favoriteFood = "молоко";
    }

    public void setSumPaws(int sumPaws) {
        if (sumPaws>4){
            System.out.println();
            System.out.println("У льва не может быть 5 лап");
        } else {
            this.sumPaws = sumPaws;
        }

    }

    public void getInfo() {
        System.out.println("У Льва " + sumPaws + " лапы.");
        System.out.println("Лев " + favoriteFood + " Обожает.");
    }

}
