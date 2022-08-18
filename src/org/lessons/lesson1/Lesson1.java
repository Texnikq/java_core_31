package org.lessons.lesson1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //комментарии тут
        boolean b = true;
        boolean b2= false;

        //byte

        byte bt = -128;
        byte bt2= 127;

        //short
        short sh =-32_768;
        short sh2 =32_767;


        int integer = -50;

        //long Длинное число 64bit
        long fon = 3_000L;

        //числа с плавающей точкой

        float floa = 0.00003f;
        System.out.println(floa);

        double doub = 3.1234567895666666666;
        System.out.println(doub);

        System.out.println(b);

        int x = 4;
        int y = 2;
        int c = x+y;
//символы
        char ch = 'ы';
        char ch2 = 102;

        System.out.println(ch);
        System.out.println(ch2);

        char[] answer2 = new char[10];
        answer2[0] = 'М';
        answer2[1] = 'О';
        answer2[2] = 'Т';
        answer2[3] = 'Ы';
        answer2[4] = 'Г';
        answer2[5] = 'А';
        System.out.println(answer2);

        char[] answer3={'a','a','a','a',};
        System.out.println(answer3);

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String word1 ="Hello";
        String word2 =" World!";
        //сложение слов
        String result = word1 + word2;
        System.out.println(result);

        String stringFromCharArray = String.valueOf(answer3);
        System.out.println(stringFromCharArray + "e");
        //все большие
        System.out.println(word1.toUpperCase());
        //все маленькие
        System.out.println(word2.toLowerCase());

//длина строки
        System.out.println(word1.length());

        String newWord1 =word1.replaceAll("llo", "licopter");
        System.out.println(newWord1);


//повторение
        System.out.println(word1.repeat(10));
        //обрезка
        String word3 = "  s             kaka          ";
        System.out.println(word3.trim());





    }
}
