package org.example;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        Dog dogBobik = new Dog("Бобик");
        Cat catSnezhok = new Cat("Снежок", 10);


        dogBobik.run(400);
        dogBobik.swim(25);


        catSnezhok.run(1);
        catSnezhok.swim(10);


        Catfeed miska1 = new Catfeed(0);

        catSnezhok.cateat(miska1);

        miska1.addfood(50);

        System.out.println("В миске: " + miska1.food + " единиц еды");


        /// вариант массива 1
        Cat[] cats1 = new Cat[3];

        cats1[0] = new Cat("Snegozavr",10);
        cats1[1] = new Cat("Snezhin",10);
        cats1[2] = new Cat("Snegopad",10);

        for (int i = 0; i < cats1.length; i++) {
            cats1[i].cateat(miska1);
            System.out.println("Имя " + cats1[i].name + ", статус сытости: " +  cats1[i].cat_fed);
        }


        /// вариант массива 2
        String[] names = {"Snezhinka", "Snegovik", "Snegr"};

        ArrayList<Cat> cats2 = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            cats2.add(new Cat(names[i],10));
            cats2.get(i).cateat(miska1);
            System.out.println("Я " + cats2.get(i).name + ", статус сытости: " +  cats2.get(i).cat_fed);
        }
        System.out.println("Всего котов: " + Cat.catcount + ". Наелось и спит: " + Cat.fatcat);


        for (int i = 0; i < Cat.allcats.size(); i++) {
            if (Cat.allcats.get(i).cat_fed == false){
                System.out.println(Cat.allcats.get(i).name + " голодный. ");
            };
        }


        Circle circle = new Circle(4);
        circle.setBorderColor("Yellow");
        circle.setFillColor("White");
        System.out.println("Периметр круга = " + circle.perimeter() + " Площадь круга = " + circle.area() + " Цвет границы : " + circle.getFillColor() + " Цвет заливки : " + circle.getBorderColor());


        Triangle triangle = new Triangle(4,5,6);
        triangle.setBorderColor("Black");
        triangle.setFillColor("Brown");
        System.out.println("Периметр треугольника = " + triangle.perimeter() + " Площадь треугольника = " + triangle.area() + " Цвет границы : " + triangle.getFillColor() + " Цвет заливки : " + triangle.getBorderColor() );


        Rectangle rectangle = new Rectangle(4,5);
        rectangle.setBorderColor("Red");
        rectangle.setFillColor("Blue");
        System.out.println("Периметр прямоугольника = " + rectangle.perimeter() + " Площадь прямоугольника = " + rectangle.area() + " Цвет границы : " + rectangle.getFillColor() + " Цвет заливки : " + rectangle.getBorderColor() );
    }
}
