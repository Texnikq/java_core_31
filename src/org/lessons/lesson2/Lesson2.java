package org.lessons.lesson2;

import org.lessons.lesson1.Lesson1;
import org.lessons.lesson3.Lesson3;

public class Lesson2 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 9;
        if (number1 == number2) {
            System.out.println("ура числа равны");
        }
        boolean result = number1 == number2;

        if (result){
            System.out.println("Ура числа до сих пор равны");
        }
        else {
            System.out.println("Числа не равны");
        }




        if (number1 > 0){
            System.out.println("число положительное");
        } else if (number1 == 0) {
            System.out.println("Число 0");
        } else {
            System.out.println("Число отрицательное");
        }

        int number3 = 3;
        String name = new String("Yuri");
        String name2 = new String("Yuri");

        if (name == name2){
            System.out.println("Имена равны");
        } else {
            System.out.println("Имена не равны");
        }
        if (name.equals(name2)) {
            System.out.println("имена равны");
        }
        // БУлева логика
        // правда или ложь. тру-правда фолс- ложь
        boolean isMilkBought = true;
        boolean isBreadBought = true;
        boolean result2 = isMilkBought && isBreadBought;
        //оператор && (логическое И) два значения должны быть true(тогда вернет true) Иначе возвращает false
        boolean result3 = true && false;

        //логическое ИЛИ Одно из значений должно быть true
        boolean result4 = isBreadBought || isMilkBought;
        boolean result5 = true || false;

        //Логическое не
        boolean sonGoToAnotherHome = true;
        boolean result7 = !sonGoToAnotherHome;
        boolean result8 = !false;

        //Циклы - нужны для многократного повторения кода, при каком либо условии

        //копайте отсюда и до обеда
        String[] cats = new String[4];
        cats[0] = "Барсик";
        cats[1] = "Мурзик";
        cats[2] = "Рыжик";
        cats[3] = "Кот";
        //for each
       // for(String cat: cats){
           // System.out.println(cat + " иди есть!");
       // }
       // for (int i = 0; i < cats.length; i+= 1) {
            //System.out.println(cats[i] + " иди есть! Номер кота: " + (i+1));

        //}
        for (int i = 3; i >=0 ; i -= 1) {
            System.out.println(cats[i]);
        }


            //останавливает приложение
            int count2 = 1;
            while (count2 < 11){
                if(count2 == 6){
                    count2++;
                    continue;
                }
                System.out.println(count2);
                count2++;
            }
            int count3= 100;
            while(count3 > 0){
                if(count3 % 3 == 0) {
                    System.out.println(count3);
                }
                count3--;
            }
            Lesson3.main(new String[4]);


        }
}

