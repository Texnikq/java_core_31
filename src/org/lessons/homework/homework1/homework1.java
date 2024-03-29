package org.lessons.homework.homework1;

import java.util.Arrays;

public class homework1 {
    public static void main(String[] args) {
        //Базовый уровень
        //Задача №1
        //Дано (их менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        System.out.println((hi.trim() + world.toLowerCase() + newLine).repeat(3));
        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже), убрать лишние слова,
        //затроить (Можно вызвать тольку одну команду System.out.print())
        //
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!

        //Задача №2
        //Создать переменные с ростом (!в метрах), весом.
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        //Пример результата вывода на экран:
        //21.0
        double height = 1.54;
        double weight = 176;
        double bmi = weight / (height * height);
        System.out.println(bmi);

        //Задача №3
        //Создать из массива букв a,b,c,d,e, строку,вывести на экран, поменять в массиве 4 букву по счету на h,
        //и снова создать строку, вывести на экран
        String[] arrays = {"a", "b", "c", "d", "e"};


        for (String array : arrays) {
            System.out.print(array);

        }
        arrays[3] = "h";
        System.out.println();
        for (String array : arrays) {
            System.out.print(array);
        }
        System.out.println();


        // Домашка
        // Задание №4 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а
        for (int i = 1; i < 101; i++) {
            System.out.print(i + "a ");

        }
        System.out.println();


        // Задание №5
        // Дано:
        int ageChildren = 2;
        // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
        // если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
        // Отправляет - имеется в виду, печатает на экран: "пошел с сад", "пошел в младшую школу" и т.д.
        // Проверьте работоспособность условий, через изменение значения переменной.
        if (ageChildren < 6) {
            System.out.println("Пошёл в сад");
        } else if (ageChildren < 11) {
            System.out.println("Пошёл в начальную школу");
        } else if (ageChildren < 17) {
            System.out.println("Пошёл в среднюю школу");
        } else {
            System.out.println("УНИВЕР!!!");
        }


        //Продвинутый уровень (Для тех, кто имеет опыт или базовая очень простая)
        //Задача №1
        //Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"
        String number = "234";
        int numberTransformation = Integer.parseInt(number);
        String text = "some_text";
        System.out.println(numberTransformation + text.length());

        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        int a = 3;
        int b = 5;
        int summ = (a + b) * (a + b);
        System.out.println(summ);


        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)
        int[] numbers1 = {1, 2, 5, 7, 10};
        int[] numbers2 = {2, 3, 2, 17, 15};
        int[] numbers3 = new int[numbers1.length + numbers2.length + numbers2.length];
        for (int i = 0; i <numbers1.length ; i++) {
            numbers3[i] = numbers1[i];
            numbers3[i + 5] = numbers2[i];
            numbers3[i + 10] = numbers1[i] * numbers2[i];
        }


        System.out.println(Arrays.toString(numbers3));
        //Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов

        String hw = "Hello world";
        String nhw = hw.replaceAll("l", "r").substring(0, 8).toUpperCase();
        System.out.println(nhw);

        // Задание №5: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = 0.01123;
        double result = 0;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.
        int count = 0;
        while (result < 1_000_000){
        result += increment;
        count++;

        }
        System.out.println(count);

        // Задание №6
        // Дано:
        boolean chicken = true;
        boolean vegetables = false;
        boolean sauce = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;
        // Задача: Повара попросили сделать салат.
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.
        if (chicken && vegetables && sauce && toast) {
            System.out.println("Приготовлю как я салат Цезарь");
        } else if (vegetables && (chicken || sausage) && eggs) {
            System.out.println("Хоть на оливьешку хватило остатков");
        } else if (vegetables) {
            System.out.println("Вот, овощной салат!");
        } else {
            System.out.println("У меня ничего нет, сидим голодные");
        }


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
        String word = " fuck";
        String wordLenght = word.substring(1,3);
        System.out.println(wordLenght);
    }
}