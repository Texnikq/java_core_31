package org.lessons.homework.homework1;

import java.util.Arrays;

public class HomeworkExpert {
    private final static String OPEN_TAG = "<data>";
    private final static String CLOSE_TAG = "</data>";
    private final static String DELIMITER = ";";
    private final static String EMAIL_SYMBOL = "@";
    private final static String Masking_SYMBOL = "*";


    public static void main(String[] args) {
        //Внимание! Если продвинутая для вас оказалась простой - пишите мне. Дам экспертную
        //Экспертный уровень
        //Задача №1
        //Создать метод маскирования персональных данных, который:
        //Телефон (до/после маскирования): 79991113344 / 7999***3344
        //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
        //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
        //
        //Входящие параметры: String text
        //Возвращаемый результат: String
        //
        //Примеры возможного текста:
        //<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client> - "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
        //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
        //<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client> - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

        //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
        //Регулярные выражения, класс StringBuilder
        String before = "<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>";
        String after = masking(before);
        System.out.println(after);


    }

    public static String masking(String text) {
        int indexStartData = text.indexOf(OPEN_TAG) + OPEN_TAG.length();
        int indexEndData = text.indexOf(CLOSE_TAG, indexStartData);

        if ((indexEndData - indexStartData) > 0) {
            String clientData = text.substring(indexStartData, indexEndData);
            for (String field : clientData.split(DELIMITER)) {
                System.out.println(field);
                if (field.contains(EMAIL_SYMBOL)){
                    String email = maskingEmail(field);
                    System.out.println(email);


                }



            }


        }

        return text.substring(indexStartData, indexEndData);


    }
    public static String maskingEmail(String field){
        int emailSymbolIndex = field.indexOf(EMAIL_SYMBOL);
        return new StringBuilder()
                .append(field.substring(0,emailSymbolIndex-1))
                .toString();



    }

}
