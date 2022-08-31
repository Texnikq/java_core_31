package org.lessons.lesson3;

public class Lesson3 {
    public static void main(String[] args) {


        System.out.println("lesson3 start");
        Human human = new Human(21, 80, "Yuri");
        Human human2 = new Human(21, 80, "Yuri");
        Human human3 = new Human(21, 80, "Yuri");
      System.out.println(human.getAge());
       human.setAge(19);
       System.out.println(human.getAge());
//
        Human.printCount();


                Cat cat1 = new Cat(true, "серый");
        Cat cat2 = new Cat(false, "белый");
       cat1.sayMeow();
       cat2.sayMeow();
       cat1.getColorCat();
        System.out.println("кот " + cat2.getColorCat2());
         Plane plane = new Plane(150, 6);
        System.out.println(plane.getCountPeople());
         plane.fly();



//        System.out.println(human);
//        System.out.println(human2);
    }
}
