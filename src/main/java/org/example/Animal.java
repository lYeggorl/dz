package org.example;

public abstract class Animal {
    String name;
    static int count = 0;
    public Animal(String name){
        this.name = name;
        count += 1;
    }
    public abstract void run(int dist);
    public abstract void swim(int dist);
}
