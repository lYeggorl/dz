package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Тест факториала на JUnit")


public class FactorialTest {
    @AfterEach
    void massagesAfterTests(){
        System.out.println("Тест закончен");
    }

    @Tag("Пройдёт")
    @Test
    void testFactorialOne()
    {
        System.out.println("Test 1");
        Assertions.assertEquals(120 , Factorial.factorial(5));
    }

    @Tag("Не Пройдёт")
    @Test
    void testFactorialTwo()
    {
        System.out.println("Test 2");
        Assertions.assertEquals(120 , Factorial.factorial(4));
    }
    @Tag("Не Пройдёт")
    @Test
    void testFactorialTree()
    {
        System.out.println("Test 3");
        assertNull(Factorial.factorial(null));
    }
}