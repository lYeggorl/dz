package org.example;

public class Factorial {
    public static Object factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Нельзя вычислить факториал отрицательного числа");
        } else if (number == 0) {
            number = 1;
            System.out.println("Факториал " + 0 + " равен " + number);
            return number;
        }
        try {
            int c = number;
            for (int i = 1; i < number; i++) {
                c = c * i;
            }
            System.out.println("Факториал " + number + " равен " + c);
            return c;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        factorial(5);
    }
}