package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;


@DisplayName("Тест факториала на JUnit")

public class FactorialTest {
    @AfterEach
    void massagesAfterTests(){
        System.out.println("Тест закончен");
    }

    @Tag("Пройдёт")
    @Test
    void testFactorialOne() {
        System.out.println("Test 1");
        Assertions.assertEquals(120 , Factorial.factorial(5));
    }
    @Tag("Не_Пройдёт")
    @Test
    void testFactorialTwo() {
        System.out.println("Test 2");
        Assertions.assertEquals(120 , Factorial.factorial(4));
    }
    @Test
    void testFactorialThree() {
        System.out.println("Test 3");
        Assertions.assertEquals(Factorial.factorial(0), 1);
    }
    @Test
    void testFactorialFour() {
        System.out.println("Test 4");
        Assertions.assertEquals(Factorial.factorial(1), 1);
    }
    @Test
    void testFactorialFive() {
        System.out.println("Test 5");
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Factorial.factorial(-6);
        });
        Assertions.assertEquals("Нельзя вычислить факториал отрицательного числа", exception.getMessage());
        System.out.println("Нельзя вычислить факториал отрицательного числа");
    }
}