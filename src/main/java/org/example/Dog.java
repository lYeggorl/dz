package org.example;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void run(int dist){
        if (dist <= 500) {
            System.out.println(name + " пробежал " + dist + " метров.");
        }else {
            System.out.println(name + " столько не пробежит");
        }
    }
    public void swim(int dist){
        if (dist <= 10) {
            System.out.println(name + " проплыл " + dist + " метров.");
        }else {
            System.out.println(name + " столько не проплывёт");
        }
    }
}
