package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Description;

public class CalculatorTest {
    @Test
    @Description("Проверка сложения двух чисел")
    public void testAdd() {
        Calculator c = new Calculator();
        Assert.assertEquals(c.add(2, 3), 5);
    }

    @Test
    @Description("Проверка вычитания двух чисел")
    public void testSubtract() {
        Calculator c = new Calculator();
        Assert.assertEquals(c.subtract(5, 3), 2);
    }

    @Test
    @Description("Проверка умножения двух чисел")
    public void testMultiply() {
        Calculator c = new Calculator();
        Assert.assertEquals(c.multiply(4, 3), 12);
    }

    @Test
    @Description("Проверка деления двух чисел")
    public void testDivide() {
        Calculator c = new Calculator();
        Assert.assertEquals(c.divide(10, 2), 5);
    }
} 
