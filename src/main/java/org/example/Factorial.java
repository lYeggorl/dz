package org.example;

public class Factorial {
    public static int factorial(int number) {
        int c = number;
        for (int i = 1; i < number; i++) {
            c = c * i;
        }
        System.out.println("Факториал " + number + " равен " + c);
        return  c;
    }
    public static void main(String[] args) {
        factorial(2);
    }
}
