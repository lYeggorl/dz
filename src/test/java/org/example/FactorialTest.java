package org.example;

import org.testng.Assert;
import org.testng.annotations.*;

import javax.sql.DataSource;

import static org.testng.Assert.*;

public class FactorialTest {
    @BeforeSuite
    public void massageBeforeSuite(){
        System.out.println("Начало  теста");
    }
    @org.testng.annotations.Test
     void testFactorialOne()
    {
        System.out.println("Test 1");
        assertEquals(Factorial.factorial(2), 2);
    }

    @org.testng.annotations.Test
    void testFactorialTwo()
    {
        System.out.println("Test 2");
        assertEquals(Factorial.factorial(8), 120);
    }
}