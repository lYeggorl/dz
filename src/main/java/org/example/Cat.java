package org.example;
import java.util.ArrayList;

public class Cat extends Animal {
    int cat_eat = 0;
    static int catcount = 0;
    static int fatcat = 0;
    boolean cat_fed = false;
    static ArrayList<Cat> allcats = new ArrayList<>();
    public Cat(String name, int eat) {
        super(name);
        cat_eat = eat;
        catcount += 1;
        allcats.add(this);
    }

    public void run(int dist) {
        if (dist <= 200) {
            System.out.println(name + " пробежал " + dist + " метров.");
        } else {
            System.out.println(name + " столько не пробежит");
        }
    }

    public void swim(int dist) {
        System.out.println("Коты не плавают.");
    }

    public void cateat(Catfeed miska) {
        if ((miska.food - cat_eat) < 0) {
            System.out.println("Коту " + name +" не хватает");
        } else {
            miska.food -= cat_eat;
            fatcat += 1;
            cat_fed = true;
        }
    }
}