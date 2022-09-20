package org.lessons.practic1;

public class Testing {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 150;
        int number3 = 199;
        int number4 = 100;

        int maxNumber = Math.max(number1, Math.max(number2, number3));
        int minNumber = Math.min(number1, Math.min(number2, number3));
        if(maxNumber-minNumber>=number4){
            System.out.println("Basta");
        }else {
            System.out.println("Rabotaem");
        }

    }
}
