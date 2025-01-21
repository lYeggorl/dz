package org.example;

public class Factorial {
    public static Object factorial(Object number) {
        try {
            int c = (int) number;
            for (int i = 1; i < (int) number; i++) {
                c = c * i;
            }
            System.out.println("Факториал " + number + " равен " + c);
            return c;
        } catch (Exception e) {
            return null;
        }
    }
    public static void main(String[] args) {
        factorial(5);
    }
}
