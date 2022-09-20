package org.lessons.lesson1;

import java.util.Arrays;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int integer = -2_147_483_648;
        int integer2 = 2_147_483_647;
        char ch = 197;
        System.out.println(ch);
        char[] answer2 = new char[6];
        System.out.println(answer2);
        answer2[0] = 'М';
        answer2[1] = 'О';
        answer2[2] = 'Т';
        answer2[3] = 'Ы';
        answer2[4] = 'Г';
        answer2[5] = 'А';
        System.out.println(answer2);

        int[] intArrays = new int[5];
        intArrays[1] = 2;
        System.out.println(intArrays[1]);
        System.out.println(Arrays.toString(intArrays));

        int[] intArrays1 = {-1,55,-300,4659,57};
        System.out.println(Arrays.toString(intArrays1));
        Arrays.sort(intArrays1);
        System.out.println(Arrays.toString(intArrays1));

        System.out.println(Arrays.equals(intArrays1, intArrays));




        char[] chArrays = {'a','b'};
        System.out.println(chArrays);
        String word1 = "Hello";
        String word2 = "    Ya tut    ";
        String stringForCharArray = String.valueOf(answer2); //преобразование массива чар в стринг.
        System.out.println(stringForCharArray.toLowerCase());
        String stringForIntArray = String.valueOf(intArrays1);

        String newWord1 = word1.replaceAll("Hello", "Пошёл нахуй!");
        System.out.println(newWord1);
        System.out.println((newWord1+"\n").repeat(10));
        System.out.println(word2.trim());



    }

}