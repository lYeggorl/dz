package org.example;

import org.testng.Assert;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class FactorialTest {
    @BeforeSuite
    public void massageBeforeSuite() {
        System.out.println("Начало  теста");
    }
    @org.testng.annotations.Test
     void testFactorialOne() {
        System.out.println("Test 1");
        assertEquals(Factorial.factorial(2), 2);
    }
    @org.testng.annotations.Test
    void testFactorialTwo() {
        System.out.println("Test 2");
        assertEquals(Factorial.factorial(8), 120);
    }
    @org.testng.annotations.Test
    void testFactorialThree() {
        System.out.println("Test 3");
        Factorial.factorial(0);
    }
    @org.testng.annotations.Test
    void testFactorialFour() {
        System.out.println("Test 4");
        assertEquals(Factorial.factorial(1), 1);
    }
    @org.testng.annotations.Test(expectedExceptions = IllegalArgumentException.class)
    void testFactorialFive() {
        System.out.println("Test 5");
        Factorial.factorial(-6);
    }
}